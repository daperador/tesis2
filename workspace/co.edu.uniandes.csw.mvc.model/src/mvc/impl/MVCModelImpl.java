/**
 */
package mvc.impl;

import annotate.impl.AnnotableImpl;

import java.util.Collection;

import mvc.Component;
import mvc.Entities;
import mvc.MVCModel;
import mvc.MvcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MVC Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mvc.impl.MVCModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvc.impl.MVCModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mvc.impl.MVCModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link mvc.impl.MVCModelImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link mvc.impl.MVCModelImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MVCModelImpl extends AnnotableImpl implements MVCModel {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected String importURI = IMPORT_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected Entities entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MVCModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.MVC_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Component>(Component.class, this, MvcPackage.MVC_MODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportURI() {
		return importURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportURI(String newImportURI) {
		String oldImportURI = importURI;
		importURI = newImportURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_MODEL__IMPORT_URI, oldImportURI, importURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entities getEntities() {
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntities(Entities newEntities, NotificationChain msgs) {
		Entities oldEntities = entities;
		entities = newEntities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_MODEL__ENTITIES, oldEntities, newEntities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntities(Entities newEntities) {
		if (newEntities != entities) {
			NotificationChain msgs = null;
			if (entities != null)
				msgs = ((InternalEObject)entities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MvcPackage.MVC_MODEL__ENTITIES, null, msgs);
			if (newEntities != null)
				msgs = ((InternalEObject)newEntities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MvcPackage.MVC_MODEL__ENTITIES, null, msgs);
			msgs = basicSetEntities(newEntities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_MODEL__ENTITIES, newEntities, newEntities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.MVC_MODEL__ENTITIES:
				return basicSetEntities(null, msgs);
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
			case MvcPackage.MVC_MODEL__NAME:
				return getName();
			case MvcPackage.MVC_MODEL__VERSION:
				return getVersion();
			case MvcPackage.MVC_MODEL__COMPONENTS:
				return getComponents();
			case MvcPackage.MVC_MODEL__IMPORT_URI:
				return getImportURI();
			case MvcPackage.MVC_MODEL__ENTITIES:
				return getEntities();
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
			case MvcPackage.MVC_MODEL__NAME:
				setName((String)newValue);
				return;
			case MvcPackage.MVC_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case MvcPackage.MVC_MODEL__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case MvcPackage.MVC_MODEL__IMPORT_URI:
				setImportURI((String)newValue);
				return;
			case MvcPackage.MVC_MODEL__ENTITIES:
				setEntities((Entities)newValue);
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
			case MvcPackage.MVC_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcPackage.MVC_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MvcPackage.MVC_MODEL__COMPONENTS:
				getComponents().clear();
				return;
			case MvcPackage.MVC_MODEL__IMPORT_URI:
				setImportURI(IMPORT_URI_EDEFAULT);
				return;
			case MvcPackage.MVC_MODEL__ENTITIES:
				setEntities((Entities)null);
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
			case MvcPackage.MVC_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcPackage.MVC_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MvcPackage.MVC_MODEL__COMPONENTS:
				return components != null && !components.isEmpty();
			case MvcPackage.MVC_MODEL__IMPORT_URI:
				return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
			case MvcPackage.MVC_MODEL__ENTITIES:
				return entities != null;
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
		result.append(", version: ");
		result.append(version);
		result.append(", importURI: ");
		result.append(importURI);
		result.append(')');
		return result.toString();
	}

} //MVCModelImpl
