package co.edu.uniandes.ticsw.spl.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import co.edu.uniandes.ticsw.spl.entity.ProductInfo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class ComponentSelectionManager {

	private ArrayList<String> optionalClasses = new ArrayList<String>();
	private ArrayList<String> mandatoryClasses = new ArrayList<String>();
	private ArrayList<String> optionalAssociations = new ArrayList<String>();
	private ArrayList<String> mandatoryAssociations = new ArrayList<String>();
	private List<ProductInfo> products;
	private final File configurationFile;
	private ProductConfigurationDialog selectionDialog;
	private final static XStream xstream = new XStream(new StaxDriver());
	
	public ComponentSelectionManager(File configuration, Resource resource) {
		xstream.alias("ProductConfiguration", ProductInfo.class);
		ArrayList<org.eclipse.uml2.uml.Class> classes = new ArrayList<org.eclipse.uml2.uml.Class>();
		ArrayList<org.eclipse.uml2.uml.Association> associations = new ArrayList<org.eclipse.uml2.uml.Association>();
		Iterator<EObject> objects = resource.getAllContents();
		while (objects.hasNext()) {
			EObject obj = objects.next();
			Stereotype str = null;
			if (obj.eClass() == UMLPackage.eINSTANCE.getClass_()) {
				org.eclipse.uml2.uml.Class cls = (org.eclipse.uml2.uml.Class) obj;
				classes.add(cls);
				str = cls.getAppliedStereotype("SPL Profile::Mandatory");
				addClass(cls.getName(), str);
			}else if(obj.eClass() == UMLPackage.eINSTANCE.getAssociation()){
				org.eclipse.uml2.uml.Association association = (org.eclipse.uml2.uml.Association) obj;
				str = association.getAppliedStereotype("SPL Profile::Mandatory");
				associations.add(association);
				addAssocation(association.getName(), str);
			}
		}
		configurationFile = new File(configuration, "products.conf");
		if(configurationFile.exists()){
			loadProducts();
		}else{
			products = new ArrayList<ProductInfo>();
			saveProducts();
		}
	}
	
	public boolean showConfiguration() {
    	selectionDialog= new ProductConfigurationDialog(Display.getDefault().getActiveShell(), optionalClasses, mandatoryClasses, optionalAssociations, mandatoryAssociations,products);
    	int dialogResult = selectionDialog.open();
    	if(dialogResult == Dialog.OK){
    		ProductInfo product = selectionDialog.getProduct();
    		products.remove(product);
    		products.add(product);
    		saveProducts();
    		return true;
    	}else{
    		return false;
    	}
	}
	
	public void loadProducts(){
		FileInputStream is = null;
		try {
			is = new FileInputStream(configurationFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		products = (List<ProductInfo>) xstream.fromXML(is);
	}
	
	public void saveProducts(){
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(configurationFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			xstream.marshal(products, new PrettyPrintWriter(new FileWriter(configurationFile)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public java.util.List<String> getSelectedClasses(){
		return selectionDialog.getSelectedClasses();
	}
	
	public java.util.List<String> getSelectedAssociations(){
		return selectionDialog.getSelectedAssociations();
	}
	
	public ProductInfo getProduct(){
		return selectionDialog.getProduct();
	}

	public void addClass(String name, Stereotype stereotype) {
		if (stereotype!=null && stereotype.getName().equals("Mandatory")) {
			mandatoryClasses.add(name);
		} else {
			optionalClasses.add(name);
		}
	}

	public void addAssocation(String name, Stereotype stereotype) {
		if (stereotype!=null && stereotype.getName().equals("Mandatory")) {
			mandatoryAssociations.add(name);
		} else {
			optionalAssociations.add(name);
		}
	}

	public ArrayList<String> getOptionalClasses() {
		return optionalClasses;
	}

	public void setOptionalClasses(ArrayList<String> optionalClasses) {
		this.optionalClasses = optionalClasses;
	}

	public ArrayList<String> getMandatoryClasses() {
		return mandatoryClasses;
	}

	public void setMandatoryClasses(ArrayList<String> mandatoryClasses) {
		this.mandatoryClasses = mandatoryClasses;
	}

	public ArrayList<String> getOptionalAssociation() {
		return optionalAssociations;
	}

	public void setOptionalAssociation(ArrayList<String> optionalAssociations) {
		this.optionalAssociations = optionalAssociations;
	}

	public ArrayList<String> getMandatoryAssociation() {
		return mandatoryAssociations;
	}

	public void setMandatoryAssociation(ArrayList<String> mandatoryAssociations) {
		this.mandatoryAssociations = mandatoryAssociations;
	}

	/**
	 * @return the products
	 */
	public List<ProductInfo> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<ProductInfo> products) {
		this.products = products;
	}

	
	

}
