/*
 * generated by Xtext
 */
package co.edu.uniandes.csw.spl.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractAnnotateitValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://co.edu.uniandes.csw.mvc.annotate/1.0"));
		return result;
	}
}
