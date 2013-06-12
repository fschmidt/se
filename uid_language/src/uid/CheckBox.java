/**
 */
package uid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.CheckBox#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getCheckBox()
 * @model
 * @generated
 */
public interface CheckBox extends UIE {

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see uid.UidPackage#getCheckBox_Text()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link uid.CheckBox#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);
} // CheckBox
