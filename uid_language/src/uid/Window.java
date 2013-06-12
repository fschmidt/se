/**
 */
package uid;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Window#isMain <em>Main</em>}</li>
 *   <li>{@link uid.Window#getHasElements <em>Has Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getWindow()
 * @model
 * @generated
 */
public interface Window extends IE {

	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(boolean)
	 * @see uid.UidPackage#getWindow_Main()
	 * @model
	 * @generated
	 */
	boolean isMain();

	/**
	 * Sets the value of the '{@link uid.Window#isMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #isMain()
	 * @generated
	 */
	void setMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Elements</b></em>' containment reference list.
	 * The list contents are of type {@link uid.IE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Elements</em>' containment reference list.
	 * @see uid.UidPackage#getWindow_HasElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<IE> getHasElements();
} // Window
