package co.edu.uniandes.ticsw.spl.transformation;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.UMLPackage;

import com.mtcflow.engine.transformation.IExecutionInformation;
import com.mtcflow.engine.transformation.TransformationExecutor;
import com.mtcflow.model.mtc.OutputModel;

public class CustomTransformation extends TransformationExecutor {


	public CustomTransformation() {
		
	}

	public void executeTransformation(IExecutionInformation arg0) throws Exception {
		ArrayList<org.eclipse.uml2.uml.Class> classes = new ArrayList<org.eclipse.uml2.uml.Class>();
		ArrayList<org.eclipse.uml2.uml.Association> associations = new ArrayList<org.eclipse.uml2.uml.Association>();
		Resource resource = executionEnvironment.getResourceSet().createResource(locator.getEMFURI(inputModels.get(0).getModel()));
		resource.load(null);
		Iterator<EObject> objects = resource.getAllContents();
		while (objects.hasNext()) {
			EObject obj = objects.next();
			if (obj.eClass() == UMLPackage.eINSTANCE.getClass_()) {
				org.eclipse.uml2.uml.Class cls = (org.eclipse.uml2.uml.Class) obj;
				classes.add(cls);
			}else if(obj.eClass() == UMLPackage.eINSTANCE.getAssociation()){
				org.eclipse.uml2.uml.Association association = (org.eclipse.uml2.uml.Association) obj;
				associations.add(association);
			}
		}

		for (org.eclipse.uml2.uml.Class cls : classes) {
			if (cls.getName().equals("Mandatory") || cls.getName().equals("Optional")){
				continue;
			}
		}
	

		for (OutputModel outModel : outputModels) {
			executionEnvironment.modelReady(outModel.getModel(), transformation);
		}

	}
}