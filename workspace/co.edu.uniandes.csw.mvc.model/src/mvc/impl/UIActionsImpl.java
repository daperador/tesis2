/**
 */
package mvc.impl;

import mvc.Event;
import mvc.MvcPackage;
import mvc.UIActions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvc.impl.UIActionsImpl#getTriggerEvent <em>Trigger Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIActionsImpl extends UIComponentImpl implements UIActions {
	/**
	 * The cached value of the '{@link #getTriggerEvent() <em>Trigger Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected Event triggerEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.UI_ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTriggerEvent() {
		if (triggerEvent != null && triggerEvent.eIsProxy()) {
			InternalEObject oldTriggerEvent = (InternalEObject)triggerEvent;
			triggerEvent = (Event)eResolveProxy(oldTriggerEvent);
			if (triggerEvent != oldTriggerEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcPackage.UI_ACTIONS__TRIGGER_EVENT, oldTriggerEvent, triggerEvent));
			}
		}
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTriggerEvent() {
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerEvent(Event newTriggerEvent) {
		Event oldTriggerEvent = triggerEvent;
		triggerEvent = newTriggerEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.UI_ACTIONS__TRIGGER_EVENT, oldTriggerEvent, triggerEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcPackage.UI_ACTIONS__TRIGGER_EVENT:
				if (resolve) return getTriggerEvent();
				return basicGetTriggerEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MvcPackage.UI_ACTIONS__TRIGGER_EVENT:
				setTriggerEvent((Event)newValue);
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
			case MvcPackage.UI_ACTIONS__TRIGGER_EVENT:
				setTriggerEvent((Event)null);
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
			case MvcPackage.UI_ACTIONS__TRIGGER_EVENT:
				return triggerEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //UIActionsImpl
