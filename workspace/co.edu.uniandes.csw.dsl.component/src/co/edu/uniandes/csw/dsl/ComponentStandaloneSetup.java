/*
* generated by Xtext
*/
package co.edu.uniandes.csw.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ComponentStandaloneSetup extends ComponentStandaloneSetupGenerated{

	public static void doSetup() {
		new ComponentStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
