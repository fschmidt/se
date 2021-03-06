/**
 */
package uid.tests;

import junit.textui.TestRunner;

import uid.UidFactory;
import uid.Window;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WindowTest extends IETest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WindowTest.class);
	}

	/**
	 * Constructs a new Window test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Window test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Window getFixture() {
		return (Window)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidFactory.eINSTANCE.createWindow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WindowTest
