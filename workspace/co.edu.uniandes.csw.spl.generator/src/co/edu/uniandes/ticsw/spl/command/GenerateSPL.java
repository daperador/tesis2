package co.edu.uniandes.ticsw.spl.command;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.Version;

import co.edu.uniandes.ticsw.spl.entity.ProductInfo;
import co.edu.uniandes.ticsw.spl.mtcflow.standalone.MTCStandaloneUtils;
import co.edu.uniandes.ticsw.spl.ui.ComponentSelectionManager;
import co.edu.uniandes.ticsw.spl.ui.GenerationDialog;
import co.edu.uniandes.ticsw.spl.ui.ProductConfigurationDialog;
import co.edu.uniandes.ticsw.spl.util.ProjectUtils;

import com.mtcflow.engine.core.MTCChoreographer;

public class GenerateSPL implements IHandler {

	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Bundle bundle = Platform.getBundle("co.edu.csw.spl.generator");
		final Version version = bundle.getVersion();

		final String action = event
				.getParameter("co.edu.uniandes.csw.spl.generator.typeParameter");
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();
		final IResource ecoreResource = (IResource) selection.getFirstElement();
		// Copy the original model to a temporal file to preserve the original
		File tempFile = null;
		final File originalModelFile = new File(ecoreResource.getLocation()
				.toOSString());
		try {
			tempFile = File.createTempFile("spl", ".uml");
			FileUtils.copyFile(originalModelFile, tempFile);
		} catch (IOException e) {
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", "An error has occurred while creating temp file of the model");
			throw new ExecutionException("An error has occurred while creating temp file of the model");
		}

		// ArrayList<IResource> resourceToRefresh = new ArrayList<IResource>();
		// resourceToRefresh.add(ecoreResource.getProject());
		final File finalTempFile = tempFile;
		Display.getDefault().asyncExec(new Runnable() {

			public void run() {
				ResourceSet rset = new ResourceSetImpl();
				Resource resource = rset.createResource(URI
						.createFileURI(finalTempFile.getAbsolutePath()));
				try {
					resource.load(null);
				} catch (IOException e) {
					MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", "An error has occurred while reading model UML file");
					throw new RuntimeException("An error has occurred while reading model UML file");
				}
				ComponentSelectionManager manager = new ComponentSelectionManager(
						originalModelFile.getParentFile(), resource);
				ProductInfo selectedProduct = null;
				if (action.equals("configureBasicProduct")) {
					File configurationFile = new File(originalModelFile
							.getParentFile(), "configuration.conf");
					Properties config = new Properties();
					if (configurationFile.exists()) {
						try {
							config.load(new FileInputStream(configurationFile));
						} catch (Exception e) {
							MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", "An error has occurred while loading config product file");
							throw new RuntimeException("An error has occurred while loading config product file");
						}
					}
					GenerationDialog dialog = new GenerationDialog(Display
							.getDefault().getActiveShell(), config
							.getProperty("projectName"), config
							.getProperty("groupName"), config
							.getProperty("path"));
					int dialogResult = dialog.open();
					if (dialogResult == Dialog.OK) {
						String projectName = dialog.getProjectName();
						String groupName = dialog.getGroupName();
						String path = dialog.getPath();
						selectedProduct = new ProductInfo();
						selectedProduct.setName("default-product");
						selectedProduct.setSelectedAssociations(manager
								.getOptionalAssociation());
						selectedProduct.setSelectedClasses(manager
								.getOptionalClasses());
						selectedProduct.setProjectName(projectName);
						selectedProduct.setGroupName(groupName);
						selectedProduct.setPath(path);
						config.setProperty("projectName", projectName);
						config.setProperty("groupName", groupName);
						config.setProperty("path", path);
						File f = new File(path);
						try {
							if (!f.exists()) {
								f.mkdirs();
							}
							if(f.isFile()){
								MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", "An error has occurred while creating directory: " + f.getAbsolutePath());
								throw new RuntimeException(
										"An error has occurred while creating directory: " + f.getAbsolutePath());
								
							}
						} catch (SecurityException ex) {
							MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", "An error has occurred while creating directory: " + f.getAbsolutePath());
							throw new RuntimeException(
									"An error has occurred while creating directory: "
											+ f.getAbsolutePath());
						}
						try {
							config.store(
									new FileOutputStream(configurationFile),
									null);
						} catch (Exception e) {
							MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", "An error has occurred while writing configuration file.");
							throw new RuntimeException("An error has occurred while writing configuration file.");
						}
					}
				} else if (action.equals("configure")) {
					manager.showConfiguration();
				} else if (action.equals("derive")) {
					ElementListSelectionDialog dialog = new ElementListSelectionDialog(
							Display.getDefault().getActiveShell(),
							new LabelProvider());
					dialog.setElements(manager.getProducts().toArray(
							new ProductInfo[] {}));
					dialog.setMultipleSelection(false);
					dialog.setTitle("Product Selection");
					dialog.setMessage("Select the product that you want to derive:");
					// user pressed cancel
					if (dialog.open() != Window.OK) {
						// do Nothing
					} else {
						Object[] result = dialog.getResult();
						if (result.length > 0) {
							selectedProduct = (ProductInfo) result[0];
						}
					}
				} else if (action.equals("generateDefault")) {
					selectedProduct = new ProductInfo();
					selectedProduct.setName("default-product");
					selectedProduct.setSelectedAssociations(manager
							.getOptionalAssociation());
					selectedProduct.setSelectedClasses(manager
							.getOptionalClasses());
				}
				if (selectedProduct != null) {
					// Set Variables
					final HashMap<String, Object> variables = new HashMap<String, Object>();
					variables.put("model", ecoreResource.getLocation()
							.toOSString());
					if (selectedProduct.getPath() != null
							&& !selectedProduct.getPath().isEmpty()) {
						variables.put("output", selectedProduct.getPath());
					} else {
						variables.put("output",
								ProjectUtils.workspaceDir.getAbsolutePath());
					}
					variables.put("projectName",
							selectedProduct.getProjectName());
					variables.put("groupName", selectedProduct.getGroupName());
					variables.put("tempModel", finalTempFile.getAbsolutePath());
					// variables.put("outputWeb",
					// ProjectUtils.workspaceDir.getAbsolutePath());
					variables.put("tempModel", finalTempFile.getAbsolutePath());
					variables.put("selectedClasses",
							selectedProduct.getSelectedClasses());
					variables.put("selectedAssociations",
							selectedProduct.getSelectedAssociations());
					variables.put("productName", selectedProduct.getName());
					variables.put("productVersion",
							selectedProduct.getVersion());
					variables.put("commonWebVersion",
							selectedProduct.getCommonVersion());
					variables.put("splGeneratorVersion",
							selectedProduct.getSplGeneratorVersion());
					variables.put("splRepository",
							selectedProduct.getSplRepository());
					variables.put("plugginVersion", version.toString());
					final MTCChoreographer choreographer = MTCStandaloneUtils
							.startMTC(ecoreResource.getProject(),
									"co.edu.csw.spl.generator", "default.mtc",
									variables, null);
					// Add listener to open the project after config files
					// generation
					// choreographer.addExecutionListener(new
					// ProjectCreatedListeners(choreographer.getMtc()));
					// Copy crudmaker.web
					File crudMakeDir = choreographer.getLocator().findFile("crudmaker.web");
					try {
						FileUtils.copyDirectory(crudMakeDir.getAbsoluteFile(), new File(selectedProduct.getPath(),"crudmaker.web"));
					} catch (Exception e) {
						choreographer.getConsole().logException("Error copying the crudmaker.web dir", e);
					}
					choreographer.start();
					choreographer.modelReady("Input Model", null);
					choreographer.modelReady("mvc model", null);
				}
				try {
					ecoreResource.getProject().refreshLocal(
							IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", "An error has occurred while refreshing the project in the workspace.");
					throw new RuntimeException("An error has occurred while refreshing the project in the workspace.");
				}
			}
		});
		return null;
	}

	public boolean isEnabled() {
		return true;
	}

	public boolean isHandled() {
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
