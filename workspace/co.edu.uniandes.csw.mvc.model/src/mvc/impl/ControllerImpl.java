/**
 */
package mvc.impl;

import annotate.impl.AnnotableImpl;

import java.util.Collection;

import mvc.Action;
import mvc.Controller;
import mvc.ControllerView;
import mvc.EventAction;
import mvc.MvcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvc.impl.ControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvc.impl.ControllerImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link mvc.impl.ControllerImpl#getViews <em>Views</em>}</li>
 *   <li>{@link mvc.impl.ControllerImpl#getEventActions <em>Event Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerImpl extends AnnotableImpl implements Controller {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllerView> views;

	/**
	 * The cached value of the '{@link #getEventActions() <em>Event Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventActions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventAction> eventActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, MvcPackage.CONTROLLER__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControllerView> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<ControllerView>(ControllerView.class, this, MvcPackage.CONTROLLER__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventAction> getEventActions() {
		if (eventActions == null) {
			eventActions = new EObjectContainmentEList<EventAction>(EventAction.class, this, MvcPackage.CONTROLLER__EVENT_ACTIONS);
		}
		return eventActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.CONTROLLER__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case MvcPackage.CONTROLLER__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case MvcPackage.CONTROLLER__EVENT_ACTIONS:
				return ((InternalEList<?>)getEventActions()).basicRemove(otherEnd, msgs);
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
			case MvcPackage.CONTROLLER__NAME:
				return getName();
			case MvcPackage.CONTROLLER__ACTIONS:
				return getActions();
			case MvcPackage.CONTROLLER__VIEWS:
				return getViews();
			case MvcPackage.CONTROLLER__EVENT_ACTIONS:
				return getEventActions();
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
			case MvcPackage.CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case MvcPackage.CONTROLLER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case MvcPackage.CONTROLLER__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends ControllerView>)newValue);
				return;
			case MvcPackage.CONTROLLER__EVENT_ACTIONS:
				getEventActions().clear();
				getEventActions().addAll((Collection<? extends EventAction>)newValue);
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
			case MvcPackage.CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcPackage.CONTROLLER__ACTIONS:
				getActions().clear();
				return;
			case MvcPackage.CONTROLLER__VIEWS:
				getViews().clear();
				return;
			case MvcPackage.CONTROLLER__EVENT_ACTIONS:
				getEventActions().clear();
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
			case MvcPackage.CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcPackage.CONTROLLER__ACTIONS:
				return actions != null && !actions.isEmpty();
			case MvcPackage.CONTROLLER__VIEWS:
				return views != null && !views.isEmpty();
			case MvcPackage.CONTROLLER__EVENT_ACTIONS:
				return eventActions != null && !eventActions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
