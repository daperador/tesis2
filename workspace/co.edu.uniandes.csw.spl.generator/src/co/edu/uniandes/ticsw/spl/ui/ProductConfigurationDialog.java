package co.edu.uniandes.ticsw.spl.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import co.edu.uniandes.ticsw.spl.entity.ProductInfo;

public class ProductConfigurationDialog extends Dialog {
	private static final String CLASS = "<<Class>> ";
	private static final String ASSOCIATION = "<<Association>> ";
	private Combo productNameInput;
	private Text productVersionInput;

	private String productName;
	private String productVersion;
	private String commonVersion;

	private java.util.List<ProductInfo> products;
	private ArrayList<String> optionalClasses;
	private ArrayList<String> mandatoryClasses;
	private ArrayList<String> optionalAssociations;
	private ArrayList<String> mandatoryAssociations;
	private ArrayList<String> selectedComponents = new ArrayList<String>();
	private ArrayList<String> avaliableComponents = new ArrayList<String>();
	private List avaliableComponentsList;
	private List selectedComponentsList;
	private Text commonVersionInput;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ProductConfigurationDialog(Shell parentShell, ArrayList<String> optionalClasses, ArrayList<String> mandatoryClasses, ArrayList<String> optionalAssociations, ArrayList<String> mandatoryAssociations, java.util.List<ProductInfo> products) {
		super(parentShell);
		this.products = products;
		this.optionalClasses = optionalClasses;
		this.mandatoryClasses = mandatoryClasses;
		this.optionalAssociations = optionalAssociations;
		this.mandatoryAssociations = mandatoryAssociations;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());
		this.getShell().addDisposeListener(new DisposeListener() {

			public void widgetDisposed(DisposeEvent e) {
				selectedComponents.addAll(Arrays.asList(getSelectedComponentsList().getItems()));
				productName = getProductNameInput().getText();
				productVersion = getProductVersionInput().getText();
				commonVersion = getCommonVersionInput().getText();
			}
		});

		Group grpMandatoryComponents = new Group(container, SWT.NONE);
		grpMandatoryComponents.setLayout(new FillLayout(SWT.HORIZONTAL));
		FormData fd_grpMandatoryComponents = new FormData();
		grpMandatoryComponents.setLayoutData(fd_grpMandatoryComponents);
		grpMandatoryComponents.setText("Mandatory Components");

		Label lblNewLabel = new Label(container, SWT.NONE);
		fd_grpMandatoryComponents.right = new FormAttachment(100, -10);
		fd_grpMandatoryComponents.left = new FormAttachment(0, 10);
		lblNewLabel.setFont(SWTResourceManager.getFont("Verdana", 20, SWT.BOLD));
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.bottom = new FormAttachment(0, 41);
		fd_lblNewLabel.right = new FormAttachment(0, 464);
		fd_lblNewLabel.top = new FormAttachment(0, 10);
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);

		lblNewLabel.setText("SPL Product Configuration");

		Label lblFgjfgj = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		FormData fd_lblFgjfgj = new FormData();
		fd_lblFgjfgj.bottom = new FormAttachment(0, 49);
		fd_lblFgjfgj.right = new FormAttachment(grpMandatoryComponents, 0, SWT.RIGHT);
		fd_lblFgjfgj.top = new FormAttachment(0, 47);
		fd_lblFgjfgj.left = new FormAttachment(0, 10);
		lblFgjfgj.setLayoutData(fd_lblFgjfgj);
		lblFgjfgj.setText("fgjfgj");

		Label lblProductName = new Label(container, SWT.NONE);
		FormData fd_lblProductName = new FormData();
		fd_lblProductName.top = new FormAttachment(lblFgjfgj, 6); 
		fd_lblProductName.left = new FormAttachment(0, 10);
		lblProductName.setLayoutData(fd_lblProductName);
		lblProductName.setText("Product Name");

		productNameInput = new Combo(container, SWT.BORDER);
		productNameInput.setItems(new String[] {});
		productNameInput.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setSelectedComponentsForProduct(productNameInput.getText());
			}
		});
		
		fd_grpMandatoryComponents.top = new FormAttachment(0, 114);

		Group grpClasses = new Group(grpMandatoryComponents, SWT.NONE);
		grpClasses.setText("Classes");
		grpClasses.setLayout(new FillLayout(SWT.HORIZONTAL));

		List mandatoryClassesList = new List(grpClasses, SWT.BORDER);

		Group grpAssociations = new Group(grpMandatoryComponents, SWT.NONE);
		grpAssociations.setText("Associations");
		grpAssociations.setLayout(new FillLayout(SWT.HORIZONTAL));

		List mandatoryAssociationsList = new List(grpAssociations, SWT.BORDER);
		FormData fd_productNameInput = new FormData();
		fd_productNameInput.bottom = new FormAttachment(grpMandatoryComponents, -6);
		fd_productNameInput.left = new FormAttachment(0, 10);
		fd_productNameInput.top = new FormAttachment(lblProductName, 6);
		productNameInput.setLayoutData(fd_productNameInput);

		Label lblVersion = new Label(container, SWT.NONE);
		FormData fd_lblVersion = new FormData();
		fd_lblVersion.left = new FormAttachment(100, -92);
		fd_lblVersion.right = new FormAttachment(100, -42);
		fd_lblVersion.top = new FormAttachment(0, 55);
		lblVersion.setLayoutData(fd_lblVersion);
		lblVersion.setText("Version");

		productVersionInput = new Text(container, SWT.BORDER);
		productVersionInput.setText("1.0.0");
		FormData fd_productVersionInput = new FormData();
		fd_productVersionInput.bottom = new FormAttachment(grpMandatoryComponents, -17);
		fd_productVersionInput.top = new FormAttachment(lblVersion, 6);
		fd_productVersionInput.left = new FormAttachment(97, -79);
		fd_productVersionInput.right = new FormAttachment(97);
		productVersionInput.setLayoutData(fd_productVersionInput);

		Group grpSelectTheComponent = new Group(container, SWT.NONE);
		fd_grpMandatoryComponents.bottom = new FormAttachment(grpSelectTheComponent, -6);
		grpSelectTheComponent.setFont(SWTResourceManager.getFont("Verdana", 11, SWT.BOLD));
		grpSelectTheComponent.setText("Select the optional components to be included");
		grpSelectTheComponent.setLayout(new FormLayout());
		FormData fd_grpSelectTheComponent = new FormData();
		fd_grpSelectTheComponent.bottom = new FormAttachment(100, -10);
		fd_grpSelectTheComponent.top = new FormAttachment(0, 295);
		fd_grpSelectTheComponent.left = new FormAttachment(0, 10);
		fd_grpSelectTheComponent.right = new FormAttachment(100, -10);
		grpSelectTheComponent.setLayoutData(fd_grpSelectTheComponent);

		Group grpAvaliable = new Group(grpSelectTheComponent, SWT.NONE);
		FormData fd_grpAvaliable = new FormData();
		fd_grpAvaliable.left = new FormAttachment(0);
		fd_grpAvaliable.bottom = new FormAttachment(100);
		fd_grpAvaliable.top = new FormAttachment(0, 3);
		grpAvaliable.setLayoutData(fd_grpAvaliable);
		grpAvaliable.setText("Avaliable");
		grpAvaliable.setLayout(new FillLayout(SWT.HORIZONTAL));

		avaliableComponentsList = new List(grpAvaliable, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.MULTI);
		avaliableComponentsList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				if(avaliableComponentsList.getSelection().length>0){
					String selectedComponent = avaliableComponentsList.getSelection()[0];
					avaliableComponentsList.remove(selectedComponent);
					selectedComponentsList.add(selectedComponent);
				}
			}
		});

		Group grpSelected = new Group(grpSelectTheComponent, SWT.NONE);
		FormData fd_grpSelected = new FormData();
		fd_grpSelected.top = new FormAttachment(0, 3);
		fd_grpSelected.bottom = new FormAttachment(100);
		fd_grpSelected.right = new FormAttachment(100);
		grpSelected.setLayoutData(fd_grpSelected);
		grpSelected.setText("Selected");
		grpSelected.setLayout(new FillLayout(SWT.HORIZONTAL));

		selectedComponentsList = new List(grpSelected, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.MULTI);
		selectedComponentsList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				if(selectedComponentsList.getSelection().length>0){
					String selectedComponent = selectedComponentsList.getSelection()[0];
					avaliableComponentsList.add(selectedComponent);
					selectedComponentsList.remove(selectedComponent);
				}
			}
		});

		Button addAllBtn = new Button(grpSelectTheComponent, SWT.NONE);
		fd_grpAvaliable.right = new FormAttachment(addAllBtn, -6);
		addAllBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (String cName : avaliableComponentsList.getItems()) {
					selectedComponentsList.add(cName);
				}
				avaliableComponentsList.removeAll();
			}
		});
		fd_grpSelected.left = new FormAttachment(0, 262);
		FormData fd_addAllBtn = new FormData();
		fd_addAllBtn.right = new FormAttachment(grpSelected, -6);
		addAllBtn.setLayoutData(fd_addAllBtn);
		addAllBtn.setText(">>");

		Button removeAllBtn = new Button(grpSelectTheComponent, SWT.NONE);
		removeAllBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (String cName : selectedComponentsList.getItems()) {
					avaliableComponentsList.add(cName);
				}
				selectedComponentsList.removeAll(); 
			}
		});
		FormData fd_removeAllBtn = new FormData();
		fd_removeAllBtn.left = new FormAttachment(grpAvaliable, 6);
		fd_removeAllBtn.right = new FormAttachment(grpSelected, -6);
		removeAllBtn.setLayoutData(fd_removeAllBtn);
		removeAllBtn.setText("<<");
		
		Button addSelectedBtn = new Button(grpSelectTheComponent, SWT.NONE);
		addSelectedBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String[] selection = avaliableComponentsList.getSelection();
				for (String cName : selection) {
					avaliableComponentsList.remove(cName);
					selectedComponentsList.add(cName);
				}
			}
		});
		addSelectedBtn.setText(">");
		FormData fd_addSelectedBtn = new FormData();
		fd_addSelectedBtn.bottom = new FormAttachment(addAllBtn, -6);
		fd_addSelectedBtn.left = new FormAttachment(grpAvaliable, 6);
		fd_addSelectedBtn.right = new FormAttachment(grpSelected, -6);
		addSelectedBtn.setLayoutData(fd_addSelectedBtn);
		
		Button removeSelectedBtn = new Button(grpSelectTheComponent, SWT.NONE);
		fd_removeAllBtn.bottom = new FormAttachment(removeSelectedBtn, -4);
		fd_addAllBtn.bottom = new FormAttachment(removeSelectedBtn, -58);
		removeSelectedBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String[] selection = selectedComponentsList.getSelection();
				for (String cName : selection) {
					avaliableComponentsList.add(cName);
					selectedComponentsList.remove(cName);
				}
			}
		});
		removeSelectedBtn.setText("<");
		FormData fd_removeSelectedBtn = new FormData();
		fd_removeSelectedBtn.bottom = new FormAttachment(100, -34);
		fd_removeSelectedBtn.right = new FormAttachment(grpSelected, -6);
		fd_removeSelectedBtn.left = new FormAttachment(grpAvaliable, 6);
		removeSelectedBtn.setLayoutData(fd_removeSelectedBtn);

		Label lblCommonVersion = new Label(container, SWT.NONE);
		FormData fd_lblCommonVersion = new FormData();
		fd_lblCommonVersion.right = new FormAttachment(lblVersion, -14);
		fd_lblCommonVersion.top = new FormAttachment(lblFgjfgj, 6);
		fd_lblCommonVersion.left = new FormAttachment(lblVersion, -113, SWT.LEFT);
		lblCommonVersion.setLayoutData(fd_lblCommonVersion);
		lblCommonVersion.setText("CRUDMaker Ver");

		commonVersionInput = new Text(container, SWT.BORDER);
		fd_productNameInput.right = new FormAttachment(commonVersionInput, -6);
		ProductInfo info=new ProductInfo();
		commonVersionInput.setText(info.getCommonVersion());
		FormData fd_commonVersionInput = new FormData();
		fd_commonVersionInput.bottom = new FormAttachment(grpMandatoryComponents, -16);
		fd_commonVersionInput.top = new FormAttachment(lblCommonVersion, 6);
		fd_commonVersionInput.left = new FormAttachment(0, 298);
		fd_commonVersionInput.right = new FormAttachment(productVersionInput, -6);
		commonVersionInput.setLayoutData(fd_commonVersionInput);

		for (String name : mandatoryClasses) {
			mandatoryClassesList.add(CLASS + name);
		}
		for (String name : mandatoryAssociations) {
			mandatoryAssociationsList.add(ASSOCIATION + name);
		}

		loadAvaliableComponents();
		
		for (ProductInfo product : products) {
			productNameInput.add(product.getName());
		}
		
		return container;
	}
	
	private void loadAvaliableComponents(){
		avaliableComponentsList.removeAll();
		for (String name : optionalClasses) {
			avaliableComponentsList.add(CLASS + name);
		}
		
		for (String name : optionalAssociations) {
			avaliableComponentsList.add(ASSOCIATION + name);
		}

	}

	public java.util.List<String> getSelectedClasses() {
		ArrayList<String> selectedClasses = new ArrayList<String>();
		for (String cName : selectedComponents) {
			if (cName.startsWith(CLASS)) {
				selectedClasses.add(cName.replaceAll(CLASS, ""));
			}
		}
		return selectedClasses;
	}

	public java.util.List<String> getSelectedAssociations() {
		ArrayList<String> selectedAssociations = new ArrayList<String>();
		for (String cName : selectedComponents) {
			if (cName.startsWith(ASSOCIATION)) {
				selectedAssociations.add(cName.replaceAll(ASSOCIATION, ""));
			}
		}
		return selectedAssociations;
	}

	public ArrayList<String> getSelectedComponents() {
		return selectedComponents;
	}

	public void setSelectedComponents(ArrayList<String> selectedComponents) {
		this.selectedComponents = selectedComponents;
	}

	public ArrayList<String> getAvaliableComponents() {
		return avaliableComponents;
	}

	public void setAvaliableComponents(ArrayList<String> avaliableComponents) {
		this.avaliableComponents = avaliableComponents;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button btnGenerate = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		btnGenerate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnGenerate.setText("Save");
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(503, 629);
	}
	
	public void setSelectedComponentsForProduct(String productName) {
		for (ProductInfo product : products) {
			if(product.getName().equals(productName)){
				productVersionInput.setText(product.getVersion());
				commonVersionInput.setText(product.getCommonVersion());
				loadAvaliableComponents();
				selectedComponentsList.removeAll();
				for (String cName : product.getSelectedClasses()) {
					selectedComponentsList.add(CLASS+cName);
				}
				for (String cName : product.getSelectedAssociations()) {
					selectedComponentsList.add(ASSOCIATION+cName);
				}
				for (String cName : selectedComponentsList.getItems()) {
					avaliableComponentsList.remove(cName);
				}
				return;
			}
		}
	}
	
	public ProductInfo getProduct(){
		ProductInfo product = new ProductInfo();
		product.setCommonVersion(commonVersion);
		product.setName(productName);
		product.setSelectedAssociations(getSelectedAssociations());
		product.setSelectedClasses(getSelectedClasses());
		product.setVersion(productVersion);
		return product;
	}

	public List getAvaliableComponentsList() {
		return avaliableComponentsList;
	}

	public List getSelectedComponentsList() {
		return selectedComponentsList;
	}

	protected Text getCommonVersionInput() {
		return commonVersionInput;
	}
	protected Text getProductVersionInput() {
		return productVersionInput;
	}
	protected Combo getProductNameInput() {
		return productNameInput;
	}
}
