/**
 */
package mvc.impl;

import annotate.impl.AnnotableImpl;

import java.util.Collection;

import mvc.Action;
import mvc.Event;
import mvc.MvcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvc.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvc.impl.ActionImpl#getPreExecutionEvent <em>Pre Execution Event</em>}</li>
 *   <li>{@link mvc.impl.ActionImpl#getPostExecutionEvent <em>Post Execution Event</em>}</li>
 *   <li>{@link mvc.impl.ActionImpl#getTriggerEvents <em>Trigger Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends AnnotableImpl implements Action {
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
	 * The cached value of the '{@link #getPreExecutionEvent() <em>Pre Execution Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreExecutionEvent()
	 * @generated
	 * @ordered
	 */
	protected Event preExecutionEvent;

	/**
	 * The cached value of the '{@link #getPostExecutionEvent() <em>Post Execution Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostExecutionEvent()
	 * @generated
	 * @ordered
	 */
	protected Event postExecutionEvent;

	/**
	 * The cached value of the '{@link #getTriggerEvents() <em>Trigger Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> triggerEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getPreExecutionEvent() {
		if (preExecutionEvent != null && preExecutionEvent.eIsProxy()) {
			InternalEObject oldPreExecutionEvent = (InternalEObject)preExecutionEvent;
			preExecutionEvent = (Event)eResolveProxy(oldPreExecutionEvent);
			if (preExecutionEvent != oldPreExecutionEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcPackage.ACTION__PRE_EXECUTION_EVENT, oldPreExecutionEvent, preExecutionEvent));
			}
		}
		return preExecutionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetPreExecutionEvent() {
		return preExecutionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreExecutionEvent(Event newPreExecutionEvent) {
		Event oldPreExecutionEvent = preExecutionEvent;
		preExecutionEvent = newPreExecutionEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.ACTION__PRE_EXECUTION_EVENT, oldPreExecutionEvent, preExecutionEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getPostExecutionEvent() {
		if (postExecutionEvent != null && postExecutionEvent.eIsProxy()) {
			InternalEObject oldPostExecutionEvent = (InternalEObject)postExecutionEvent;
			postExecutionEvent = (Event)eResolveProxy(oldPostExecutionEvent);
			if (postExecutionEvent != oldPostExecutionEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcPackage.ACTION__POST_EXECUTION_EVENT, oldPostExecutionEvent, postExecutionEvent));
			}
		}
		return postExecutionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetPostExecutionEvent() {
		return postExecutionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostExecutionEvent(Event newPostExecutionEvent) {
		Event oldPostExecutionEvent = postExecutionEvent;
		postExecutionEvent = newPostExecutionEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.ACTION__POST_EXECUTION_EVENT, oldPostExecutionEvent, postExecutionEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getTriggerEvents() {
		if (triggerEvents == null) {
			triggerEvents = new EObjectResolvingEList<Event>(Event.class, this, MvcPackage.ACTION__TRIGGER_EVENTS);
		}
		return triggerEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcPackage.ACTION__NAME:
				return getName();
			case MvcPackage.ACTION__PRE_EXECUTION_EVENT:
				if (resolve) return getPreExecutionEvent();
				return basicGetPreExecutionEvent();
			case MvcPackage.ACTION__POST_EXECUTION_EVENT:
				if (resolve) return getPostExecutionEvent();
				return basicGetPostExecutionEvent();
			case MvcPackage.ACTION__TRIGGER_EVENTS:
				return getTriggerEvents();
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
			case MvcPackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case MvcPackage.ACTION__PRE_EXECUTION_EVENT:
				setPreExecutionEvent((Event)newValue);
				return;
			case MvcPackage.ACTION__POST_EXECUTION_EVENT:
				setPostExecutionEvent((Event)newValue);
				return;
			case MvcPackage.ACTION__TRIGGER_EVENTS:
				getTriggerEvents().clear();
				getTriggerEvents().addAll((Collection<? extends Event>)newValue);
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
			case MvcPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcPackage.ACTION__PRE_EXECUTION_EVENT:
				setPreExecutionEvent((Event)null);
				return;
			case MvcPackage.ACTION__POST_EXECUTION_EVENT:
				setPostExecutionEvent((Event)null);
				return;
			case MvcPackage.ACTION__TRIGGER_EVENTS:
				getTriggerEvents().clear();
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
			case MvcPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcPackage.ACTION__PRE_EXECUTION_EVENT:
				return preExecutionEvent != null;
			case MvcPackage.ACTION__POST_EXECUTION_EVENT:
				return postExecutionEvent != null;
			case MvcPackage.ACTION__TRIGGER_EVENTS:
				return triggerEvents != null && !triggerEvents.isEmpty();
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

} //ActionImpl
