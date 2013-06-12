/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.App#getHas <em>Has</em>}</li>
 *   <li>{@link uid.App#getHasIE <em>Has IE</em>}</li>
 *   <li>{@link uid.App#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link uid.IEAssoc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see uid.UidPackage#getApp_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<IEAssoc> getHas();

	/**
	 * Returns the value of the '<em><b>Has IE</b></em>' containment reference list.
	 * The list contents are of type {@link uid.IE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has IE</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has IE</em>' containment reference list.
	 * @see uid.UidPackage#getApp_HasIE()
	 * @model containment="true"
	 * @generated
	 */
	EList<IE> getHasIE();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uid.UidPackage#getApp_Name()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.App#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // App
