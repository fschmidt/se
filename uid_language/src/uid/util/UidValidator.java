/**
 */
package uid.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uid.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uid.UidPackage
 * @generated
 */
public class UidValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UidValidator INSTANCE = new UidValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uid";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return UidPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case UidPackage.WINDOW:
				return validateWindow((Window)value, diagnostics, context);
			case UidPackage.IE:
				return validateIE((IE)value, diagnostics, context);
			case UidPackage.BUTTON:
				return validateButton((Button)value, diagnostics, context);
			case UidPackage.TEXT_FIELD:
				return validateTextField((TextField)value, diagnostics, context);
			case UidPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case UidPackage.IE_ASSOC:
				return validateIEAssoc((IEAssoc)value, diagnostics, context);
			case UidPackage.APP:
				return validateApp((App)value, diagnostics, context);
			case UidPackage.CHECK_BOX:
				return validateCheckBox((CheckBox)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow(Window window, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(window, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(window, diagnostics, context);
		if (result || diagnostics != null) result &= validateIE_nameNotNull(window, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIE(IE ie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ie, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ie, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ie, diagnostics, context);
		if (result || diagnostics != null) result &= validateIE_nameNotNull(ie, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nameNotNull constraint of '<em>IE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IE__NAME_NOT_NULL__EEXPRESSION = "name.oclIsUndefined() <> true";

	/**
	 * Validates the nameNotNull constraint of '<em>IE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIE_nameNotNull(IE ie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UidPackage.Literals.IE,
				 ie,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nameNotNull",
				 IE__NAME_NOT_NULL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(button, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(button, diagnostics, context);
		if (result || diagnostics != null) result &= validateIE_nameNotNull(button, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validateIE_nameNotNull(textField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(list, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validateIE_nameNotNull(list, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIEAssoc(IEAssoc ieAssoc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ieAssoc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApp(App app, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(app, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckBox(CheckBox checkBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(checkBox, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(checkBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(checkBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(checkBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(checkBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(checkBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(checkBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(checkBox, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(checkBox, diagnostics, context);
		if (result || diagnostics != null) result &= validateIE_nameNotNull(checkBox, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //UidValidator
