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
	 * The feature id for the '<em><b>Has Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HAS_ELEMENTS = IE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = IE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uid.impl.UIEImpl <em>UIE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.UIEImpl
	 * @see uid.impl.UidPackageImpl#getUIE()
	 * @generated
	 */
	int UIE = 8;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIE__IE_ASSOC = IE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIE__NAME = IE__NAME;

	/**
	 * The number of structural features of the '<em>UIE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UIE_FEATURE_COUNT = IE_FEATURE_COUNT + 0;

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
	int BUTTON__IE_ASSOC = UIE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = UIE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = UIE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = UIE_FEATURE_COUNT + 1;

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
	int TEXT_FIELD__IE_ASSOC = UIE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = UIE__NAME;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = UIE_FEATURE_COUNT + 0;

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
	int LIST__IE_ASSOC = UIE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = UIE__NAME;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = UIE_FEATURE_COUNT + 0;

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
	int CHECK_BOX__IE_ASSOC = UIE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = UIE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TEXT = UIE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = UIE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link uid.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ContainerImpl
	 * @see uid.impl.UidPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IE_ASSOC = UIE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = UIE__NAME;

	/**
	 * The feature id for the '<em><b>Has Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HAS_ELEMENTS = UIE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allign Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ALLIGN_HORIZONTAL = UIE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = UIE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link uid.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.LabelImpl
	 * @see uid.impl.UidPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 10;

	/**
	 * The feature id for the '<em><b>Ie Assoc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__IE_ASSOC = UIE__IE_ASSOC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = UIE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = UIE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = UIE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link uid.impl.unVisibeleAssocImpl <em>un Visibele Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.unVisibeleAssocImpl
	 * @see uid.impl.UidPackageImpl#getunVisibeleAssoc()
	 * @generated
	 */
	int UN_VISIBELE_ASSOC = 11;

	/**
	 * The feature id for the '<em><b>Ie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_VISIBELE_ASSOC__IE = IE_ASSOC__IE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_VISIBELE_ASSOC__NAME = IE_ASSOC__NAME;

	/**
	 * The number of structural features of the '<em>un Visibele Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_VISIBELE_ASSOC_FEATURE_COUNT = IE_ASSOC_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link uid.Window#getHasElements <em>Has Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Elements</em>'.
	 * @see uid.Window#getHasElements()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_HasElements();

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
	 * Returns the meta object for the attribute '{@link uid.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uid.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Text();

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
	 * Returns the meta object for the attribute '{@link uid.CheckBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uid.CheckBox#getText()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Text();

	/**
	 * Returns the meta object for class '{@link uid.UIE <em>UIE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UIE</em>'.
	 * @see uid.UIE
	 * @generated
	 */
	EClass getUIE();

	/**
	 * Returns the meta object for class '{@link uid.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see uid.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Container#getHasElements <em>Has Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Elements</em>'.
	 * @see uid.Container#getHasElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_HasElements();

	/**
	 * Returns the meta object for the attribute '{@link uid.Container#isAllignHorizontal <em>Allign Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allign Horizontal</em>'.
	 * @see uid.Container#isAllignHorizontal()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_AllignHorizontal();

	/**
	 * Returns the meta object for class '{@link uid.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see uid.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link uid.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uid.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for class '{@link uid.unVisibeleAssoc <em>un Visibele Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>un Visibele Assoc</em>'.
	 * @see uid.unVisibeleAssoc
	 * @generated
	 */
	EClass getunVisibeleAssoc();

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
		 * The meta object literal for the '<em><b>Has Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__HAS_ELEMENTS = eINSTANCE.getWindow_HasElements();

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
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

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

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__TEXT = eINSTANCE.getCheckBox_Text();

		/**
		 * The meta object literal for the '{@link uid.impl.UIEImpl <em>UIE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.UIEImpl
		 * @see uid.impl.UidPackageImpl#getUIE()
		 * @generated
		 */
		EClass UIE = eINSTANCE.getUIE();

		/**
		 * The meta object literal for the '{@link uid.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ContainerImpl
		 * @see uid.impl.UidPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Has Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__HAS_ELEMENTS = eINSTANCE.getContainer_HasElements();

		/**
		 * The meta object literal for the '<em><b>Allign Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__ALLIGN_HORIZONTAL = eINSTANCE.getContainer_AllignHorizontal();

		/**
		 * The meta object literal for the '{@link uid.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.LabelImpl
		 * @see uid.impl.UidPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '{@link uid.impl.unVisibeleAssocImpl <em>un Visibele Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.unVisibeleAssocImpl
		 * @see uid.impl.UidPackageImpl#getunVisibeleAssoc()
		 * @generated
		 */
		EClass UN_VISIBELE_ASSOC = eINSTANCE.getunVisibeleAssoc();

	}

} //UidPackage
