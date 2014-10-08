/**
 */
package mvc.impl;

import java.util.Collection;

import mvc.MvcPackage;
import mvc.UIComponent;
import mvc.UILayout;
import mvc.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvc.impl.UILayoutImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link mvc.impl.UILayoutImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link mvc.impl.UILayoutImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link mvc.impl.UILayoutImpl#getImportView <em>Import View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UILayoutImpl extends UIComponentImpl implements UILayout {
	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected String orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<UIComponent> components;

	/**
	 * The cached value of the '{@link #getImportView() <em>Import View</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> importView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UILayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.UI_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		String oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.UI_LAYOUT__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.UI_LAYOUT__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<UIComponent>(UIComponent.class, this, MvcPackage.UI_LAYOUT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getImportView() {
		if (importView == null) {
			importView = new EObjectResolvingEList<View>(View.class, this, MvcPackage.UI_LAYOUT__IMPORT_VIEW);
		}
		return importView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.UI_LAYOUT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcPackage.UI_LAYOUT__ORIENTATION:
				return getOrientation();
			case MvcPackage.UI_LAYOUT__COLUMNS:
				return getColumns();
			case MvcPackage.UI_LAYOUT__COMPONENTS:
				return getComponents();
			case MvcPackage.UI_LAYOUT__IMPORT_VIEW:
				return getImportView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MvcPackage.UI_LAYOUT__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case MvcPackage.UI_LAYOUT__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case MvcPackage.UI_LAYOUT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends UIComponent>)newValue);
				return;
			case MvcPackage.UI_LAYOUT__IMPORT_VIEW:
				getImportView().clear();
				getImportView().addAll((Collection<? extends View>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MvcPackage.UI_LAYOUT__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case MvcPackage.UI_LAYOUT__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case MvcPackage.UI_LAYOUT__COMPONENTS:
				getComponents().clear();
				return;
			case MvcPackage.UI_LAYOUT__IMPORT_VIEW:
				getImportView().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MvcPackage.UI_LAYOUT__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case MvcPackage.UI_LAYOUT__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case MvcPackage.UI_LAYOUT__COMPONENTS:
				return components != null && !components.isEmpty();
			case MvcPackage.UI_LAYOUT__IMPORT_VIEW:
				return importView != null && !importView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(", columns: ");
		result.append(columns);
		result.append(')');
		return result.toString();
	}

} //UILayoutImpl
