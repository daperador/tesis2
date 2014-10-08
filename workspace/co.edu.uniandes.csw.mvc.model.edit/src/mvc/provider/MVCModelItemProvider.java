/**
 */
package mvc.provider;


import annotate.provider.AnnotableItemProvider;
import java.util.Collection;
import java.util.List;
import mvc.MVCModel;
import mvc.MvcFactory;
import mvc.MvcPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mvc.MVCModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MVCModelItemProvider extends AnnotableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MVCModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addImportURIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MVCModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MVCModel_name_feature", "_UI_MVCModel_type"),
				 MvcPackage.Literals.MVC_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MVCModel_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MVCModel_version_feature", "_UI_MVCModel_type"),
				 MvcPackage.Literals.MVC_MODEL__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Import URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MVCModel_importURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MVCModel_importURI_feature", "_UI_MVCModel_type"),
				 MvcPackage.Literals.MVC_MODEL__IMPORT_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MvcPackage.Literals.MVC_MODEL__MODELS);
			childrenFeatures.add(MvcPackage.Literals.MVC_MODEL__VIEWS);
			childrenFeatures.add(MvcPackage.Literals.MVC_MODEL__EVENTS);
			childrenFeatures.add(MvcPackage.Literals.MVC_MODEL__CONTROLLERS);
			childrenFeatures.add(MvcPackage.Literals.MVC_MODEL__COMPONENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MVCModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MVCModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MVCModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MVCModel_type") :
			getString("_UI_MVCModel_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MVCModel.class)) {
			case MvcPackage.MVC_MODEL__NAME:
			case MvcPackage.MVC_MODEL__VERSION:
			case MvcPackage.MVC_MODEL__IMPORT_URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MvcPackage.MVC_MODEL__MODELS:
			case MvcPackage.MVC_MODEL__VIEWS:
			case MvcPackage.MVC_MODEL__EVENTS:
			case MvcPackage.MVC_MODEL__CONTROLLERS:
			case MvcPackage.MVC_MODEL__COMPONENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MvcPackage.Literals.MVC_MODEL__MODELS,
				 MvcFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(MvcPackage.Literals.MVC_MODEL__VIEWS,
				 MvcFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(MvcPackage.Literals.MVC_MODEL__EVENTS,
				 MvcFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(MvcPackage.Literals.MVC_MODEL__CONTROLLERS,
				 MvcFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(MvcPackage.Literals.MVC_MODEL__COMPONENTS,
				 MvcFactory.eINSTANCE.createComponent()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MVCEditPlugin.INSTANCE;
	}

}
