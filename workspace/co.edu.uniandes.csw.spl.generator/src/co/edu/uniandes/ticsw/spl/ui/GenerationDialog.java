package co.edu.uniandes.ticsw.spl.ui;

import java.awt.FileDialog;
import java.io.File;
import java.util.Arrays;

import javax.swing.JDialog;
import javax.swing.JFileChooser;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GenerationDialog extends Dialog {
	private Text txtPath;
	private Text txtProjectName;
	private Text txtGroupName;
	private String projectName;
	private String groupName;
	private String path;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public GenerationDialog(Shell parentShell, String projectName, String groupName, String path) {
		super(parentShell);
		this.projectName = projectName;
		this.groupName = groupName;
		this.path = path;

	}
	
	
	
	public String getProjectName(){
		return projectName;
	}
	
	public String getGroupName(){
		return groupName;
	}
	
	public String getPath(){
		return path;
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(final Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());
		
		this.getShell().addDisposeListener(new DisposeListener() {

			public void widgetDisposed(DisposeEvent e) {
				projectName = txtProjectName.getText();
				groupName=txtGroupName.getText();
				path = txtPath.getText(); 
			}
		});
		
		txtPath = new Text(container, SWT.BORDER);
		FormData fd_txtPath = new FormData();
		fd_txtPath.bottom = new FormAttachment(100, -12);
		fd_txtPath.left = new FormAttachment(0, 10);
		txtPath.setLayoutData(fd_txtPath);
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		fd_lblNewLabel.bottom = new FormAttachment(txtPath, -6);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setText("Generation Folder");
		
		Button btnBrowse = new Button(container, SWT.NONE);

		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//File workingDirectory = new File(System.getProperty("user.dir"));
				//JFileChooser fileChooser = new JFileChooser(workingDirectory);
				DirectoryDialog dialog = new DirectoryDialog(parent.getShell());
				dialog.setFilterPath(System.getProperty("user.dir"));
				dialog.setMessage("Select the directory to generate the App");
				String result = dialog.open();
				//fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
				if(result !=null){
					path = result;
					txtPath.setText(path);
				}
			}
		});
		fd_txtPath.right = new FormAttachment(100, -107);
		FormData fd_btnBrowse = new FormData();
		fd_btnBrowse.top = new FormAttachment(txtPath, 0, SWT.TOP);
		fd_btnBrowse.right = new FormAttachment(100, -10);
		fd_btnBrowse.left = new FormAttachment(txtPath, 6);
		fd_btnBrowse.bottom = new FormAttachment(100, -10);
		btnBrowse.setLayoutData(fd_btnBrowse);
		btnBrowse.setText("Browse ...");
		
		Label lblNewLabel_1 = new Label(container, SWT.NONE);
		FormData fd_lblNewLabel_1 = new FormData();
		fd_lblNewLabel_1.bottom = new FormAttachment(100, -137);
		fd_lblNewLabel_1.left = new FormAttachment(0, 10);
		lblNewLabel_1.setLayoutData(fd_lblNewLabel_1);
		lblNewLabel_1.setText("Project Name");
		
		txtProjectName = new Text(container, SWT.BORDER);
		FormData fd_txtProjectName = new FormData();
		fd_txtProjectName.top = new FormAttachment(lblNewLabel_1, 6);
		fd_txtProjectName.bottom = new FormAttachment(100, -110);
		fd_txtProjectName.left = new FormAttachment(0, 10);
		fd_txtProjectName.right = new FormAttachment(0, 434);
		txtProjectName.setLayoutData(fd_txtProjectName);
		
		Label lblGroupName = new Label(container, SWT.NONE);
		FormData fd_lblGroupName = new FormData();
		fd_lblGroupName.left = new FormAttachment(txtPath, 0, SWT.LEFT);
		lblGroupName.setLayoutData(fd_lblGroupName);
		lblGroupName.setText("Group name");
		
		txtGroupName = new Text(container, SWT.BORDER);
		fd_lblGroupName.bottom = new FormAttachment(txtGroupName, -6);
		FormData fd_txtGroupName = new FormData();
		fd_txtGroupName.left = new FormAttachment(0, 10);
		fd_txtGroupName.right = new FormAttachment(0, 434);
		fd_txtGroupName.bottom = new FormAttachment(lblNewLabel, -6);
		txtGroupName.setLayoutData(fd_txtGroupName);
		
		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		FormData fd_label = new FormData();
		fd_label.left = new FormAttachment(0, 10);
		fd_label.right = new FormAttachment(100, -10);
		fd_label.top = new FormAttachment(lblNewLabel_1, -8, SWT.TOP);
		fd_label.bottom = new FormAttachment(lblNewLabel_1, -6);
		label.setLayoutData(fd_label);
		
		Label lblCrudmake = new Label(container, SWT.NONE);
		lblCrudmake.setAlignment(SWT.CENTER);
		lblCrudmake.setFont(SWTResourceManager.getFont("Verdana", 18, SWT.BOLD));
		FormData fd_lblCrudmake = new FormData();
		fd_lblCrudmake.bottom = new FormAttachment(label, -16);
		fd_lblCrudmake.top = new FormAttachment(0, 10);
		fd_lblCrudmake.right = new FormAttachment(btnBrowse, 0, SWT.RIGHT);
		fd_lblCrudmake.left = new FormAttachment(0, 10);
		lblCrudmake.setLayoutData(fd_lblCrudmake);
		lblCrudmake.setText("CRUDMaker - App Generation");

		if(projectName!=null)
		txtProjectName.setText(projectName);
		if(groupName!=null)
		txtGroupName.setText(groupName);
		if(path!=null)
		txtPath.setText(path);
		
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Generate App",
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
}
