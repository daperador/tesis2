/**
 * generated by Xtext
 */
package co.edu.uniandes.csw.dsl.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class EntitiesLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public EntitiesLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}