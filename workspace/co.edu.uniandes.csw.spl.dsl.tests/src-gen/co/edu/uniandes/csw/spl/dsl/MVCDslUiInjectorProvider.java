/*
* generated by Xtext
*/
package co.edu.uniandes.csw.spl.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MVCDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return co.edu.uniandes.csw.spl.dsl.ui.internal.MVCDslActivator.getInstance().getInjector("co.edu.uniandes.csw.spl.dsl.MVCDsl");
	}
	
}
