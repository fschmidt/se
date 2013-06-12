/**
 */
package uid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IE Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.IEAssoc#getIe <em>Ie</em>}</li>
 *   <li>{@link uid.IEAssoc#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getIEAssoc()
 * @model
 * @generated
 */
public interface IEAssoc extends EObject {
	/**
	 * Returns the value of the '<em><b>Ie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ie</em>' reference.
	 * @see #setIe(IE)
	 * @see uid.UidPackage#getIEAssoc_Ie()
	 * @model required="true"
	 * @generated
	 */
	IE getIe();

	/**
	 * Sets the value of the '{@link uid.IEAssoc#getIe <em>Ie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ie</em>' reference.
	 * @see #getIe()
	 * @generated
	 */
	void setIe(IE value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uid.UidPackage#getIEAssoc_Name()
	 * @model default="" dataType="types.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.IEAssoc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IEAssoc
