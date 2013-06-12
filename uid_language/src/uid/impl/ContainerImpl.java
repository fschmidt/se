/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uid.Container;
import uid.UIE;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.ContainerImpl#getHasElements <em>Has Elements</em>}</li>
 *   <li>{@link uid.impl.ContainerImpl#isAllignHorizontal <em>Allign Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends UIEImpl implements Container {
	/**
	 * The cached value of the '{@link #getHasElements() <em>Has Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasElements()
	 * @generated
	 * @ordered
	 */
	protected EList<UIE> hasElements;

	/**
	 * The default value of the '{@link #isAllignHorizontal() <em>Allign Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllignHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLIGN_HORIZONTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllignHorizontal() <em>Allign Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllignHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean allignHorizontal = ALLIGN_HORIZONTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIE> getHasElements() {
		if (hasElements == null) {
			hasElements = new EObjectContainmentEList<UIE>(UIE.class, this, UidPackage.CONTAINER__HAS_ELEMENTS);
		}
		return hasElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllignHorizontal() {
		return allignHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllignHorizontal(boolean newAllignHorizontal) {
		boolean oldAllignHorizontal = allignHorizontal;
		allignHorizontal = newAllignHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.CONTAINER__ALLIGN_HORIZONTAL, oldAllignHorizontal, allignHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidPackage.CONTAINER__HAS_ELEMENTS:
				return ((InternalEList<?>)getHasElements()).basicRemove(otherEnd, msgs);
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
			case UidPackage.CONTAINER__HAS_ELEMENTS:
				return getHasElements();
			case UidPackage.CONTAINER__ALLIGN_HORIZONTAL:
				return isAllignHorizontal();
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
			case UidPackage.CONTAINER__HAS_ELEMENTS:
				getHasElements().clear();
				getHasElements().addAll((Collection<? extends UIE>)newValue);
				return;
			case UidPackage.CONTAINER__ALLIGN_HORIZONTAL:
				setAllignHorizontal((Boolean)newValue);
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
			case UidPackage.CONTAINER__HAS_ELEMENTS:
				getHasElements().clear();
				return;
			case UidPackage.CONTAINER__ALLIGN_HORIZONTAL:
				setAllignHorizontal(ALLIGN_HORIZONTAL_EDEFAULT);
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
			case UidPackage.CONTAINER__HAS_ELEMENTS:
				return hasElements != null && !hasElements.isEmpty();
			case UidPackage.CONTAINER__ALLIGN_HORIZONTAL:
				return allignHorizontal != ALLIGN_HORIZONTAL_EDEFAULT;
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
		result.append(" (AllignHorizontal: ");
		result.append(allignHorizontal);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
