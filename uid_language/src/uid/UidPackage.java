/**
 */
package uid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uid.UidFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface UidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uid/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidPackage eINSTANCE = uid.impl.UidPackageImpl.init();

	/**
	 * The meta object id for the '{@link uid.impl.IEImpl <em>IE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.IEImpl
	 * @see uid.impl.UidPackageImpl#getIE()
	 * @generated
	 */
	int IE = 1;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IE__IE_ASSOC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IE__NAME = 1;

	/**
	 * The number of structural features of the '<em>IE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uid.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.WindowImpl
	 * @see uid.impl.UidPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 0;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__IE_ASSOC = IE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = IE__NAME;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MAIN = IE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Button</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HAS_BUTTON = IE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = IE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uid.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ButtonImpl
	 * @see uid.impl.UidPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 2;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IE_ASSOC = IE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = IE__NAME;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = IE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uid.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.TextFieldImpl
	 * @see uid.impl.UidPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__IE_ASSOC = IE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = IE__NAME;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = IE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uid.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ListImpl
	 * @see uid.impl.UidPackageImpl#getList()
	 * @generated
	 */
	int LIST = 4;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IE_ASSOC = IE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = IE__NAME;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = IE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uid.impl.IEAssocImpl <em>IE Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.IEAssocImpl
	 * @see uid.impl.UidPackageImpl#getIEAssoc()
	 * @generated
	 */
	int IE_ASSOC = 5;

	/**
	 * The feature id for the '<em><b>Ie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IE_ASSOC__IE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IE_ASSOC__NAME = 1;

	/**
	 * The number of structural features of the '<em>IE Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IE_ASSOC_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link uid.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.AppImpl
	 * @see uid.impl.UidPackageImpl#getApp()
	 * @generated
	 */
	int APP = 6;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HAS = 0;

	/**
	 * The feature id for the '<em><b>Has IE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__HAS_IE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAME = 2;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link uid.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.CheckBoxImpl
	 * @see uid.impl.UidPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 7;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__IE_ASSOC = IE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = IE__NAME;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = IE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uid.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see uid.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link uid.Window#isMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main</em>'.
	 * @see uid.Window#isMain()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Main();

	/**
	 * Returns the meta object for the reference list '{@link uid.Window#getHasButton <em>Has Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Button</em>'.
	 * @see uid.Window#getHasButton()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_HasButton();

	/**
	 * Returns the meta object for class '{@link uid.IE <em>IE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IE</em>'.
	 * @see uid.IE
	 * @generated
	 */
	EClass getIE();

	/**
	 * Returns the meta object for the reference list '{@link uid.IE#getIeAssoc <em>Ie Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ie Assoc</em>'.
	 * @see uid.IE#getIeAssoc()
	 * @see #getIE()
	 * @generated
	 */
	EReference getIE_IeAssoc();

	/**
	 * Returns the meta object for the attribute '{@link uid.IE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.IE#getName()
	 * @see #getIE()
	 * @generated
	 */
	EAttribute getIE_Name();

	/**
	 * Returns the meta object for class '{@link uid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see uid.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link uid.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see uid.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for class '{@link uid.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see uid.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link uid.IEAssoc <em>IE Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IE Assoc</em>'.
	 * @see uid.IEAssoc
	 * @generated
	 */
	EClass getIEAssoc();

	/**
	 * Returns the meta object for the reference '{@link uid.IEAssoc#getIe <em>Ie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ie</em>'.
	 * @see uid.IEAssoc#getIe()
	 * @see #getIEAssoc()
	 * @generated
	 */
	EReference getIEAssoc_Ie();

	/**
	 * Returns the meta object for the attribute '{@link uid.IEAssoc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.IEAssoc#getName()
	 * @see #getIEAssoc()
	 * @generated
	 */
	EAttribute getIEAssoc_Name();

	/**
	 * Returns the meta object for class '{@link uid.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see uid.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.App#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see uid.App#getHas()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.App#getHasIE <em>Has IE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has IE</em>'.
	 * @see uid.App#getHasIE()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_HasIE();

	/**
	 * Returns the meta object for the attribute '{@link uid.App#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.App#getName()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Name();

	/**
	 * Returns the meta object for class '{@link uid.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see uid.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UidFactory getUidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uid.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.WindowImpl
		 * @see uid.impl.UidPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__MAIN = eINSTANCE.getWindow_Main();

		/**
		 * The meta object literal for the '<em><b>Has Button</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__HAS_BUTTON = eINSTANCE.getWindow_HasButton();

		/**
		 * The meta object literal for the '{@link uid.impl.IEImpl <em>IE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.IEImpl
		 * @see uid.impl.UidPackageImpl#getIE()
		 * @generated
		 */
		EClass IE = eINSTANCE.getIE();

		/**
		 * The meta object literal for the '<em><b>Ie Assoc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IE__IE_ASSOC = eINSTANCE.getIE_IeAssoc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IE__NAME = eINSTANCE.getIE_Name();

		/**
		 * The meta object literal for the '{@link uid.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ButtonImpl
		 * @see uid.impl.UidPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link uid.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.TextFieldImpl
		 * @see uid.impl.UidPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '{@link uid.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ListImpl
		 * @see uid.impl.UidPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link uid.impl.IEAssocImpl <em>IE Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.IEAssocImpl
		 * @see uid.impl.UidPackageImpl#getIEAssoc()
		 * @generated
		 */
		EClass IE_ASSOC = eINSTANCE.getIEAssoc();

		/**
		 * The meta object literal for the '<em><b>Ie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IE_ASSOC__IE = eINSTANCE.getIEAssoc_Ie();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IE_ASSOC__NAME = eINSTANCE.getIEAssoc_Name();

		/**
		 * The meta object literal for the '{@link uid.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.AppImpl
		 * @see uid.impl.UidPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__HAS = eINSTANCE.getApp_Has();

		/**
		 * The meta object literal for the '<em><b>Has IE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__HAS_IE = eINSTANCE.getApp_HasIE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__NAME = eINSTANCE.getApp_Name();

		/**
		 * The meta object literal for the '{@link uid.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.CheckBoxImpl
		 * @see uid.impl.UidPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

	}

} //UidPackage
