/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Container#getHasElements <em>Has Elements</em>}</li>
 *   <li>{@link uid.Container#isAllignHorizontal <em>Allign Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends UIE {
	/**
	 * Returns the value of the '<em><b>Has Elements</b></em>' containment reference list.
	 * The list contents are of type {@link uid.UIE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Elements</em>' containment reference list.
	 * @see uid.UidPackage#getContainer_HasElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIE> getHasElements();

	/**
	 * Returns the value of the '<em><b>Allign Horizontal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allign Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allign Horizontal</em>' attribute.
	 * @see #setAllignHorizontal(boolean)
	 * @see uid.UidPackage#getContainer_AllignHorizontal()
	 * @model default="false"
	 * @generated
	 */
	boolean isAllignHorizontal();

	/**
	 * Sets the value of the '{@link uid.Container#isAllignHorizontal <em>Allign Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allign Horizontal</em>' attribute.
	 * @see #isAllignHorizontal()
	 * @generated
	 */
	void setAllignHorizontal(boolean value);

} // Container
