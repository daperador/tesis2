/*
 * generated by Xtext
 */
package co.edu.uniandes.csw.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import co.edu.uniandes.csw.dsl.ui.internal.EntitiesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntitiesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EntitiesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EntitiesActivator.getInstance().getInjector(EntitiesActivator.CO_EDU_UNIANDES_CSW_DSL_ENTITIES);
	}
	
}
