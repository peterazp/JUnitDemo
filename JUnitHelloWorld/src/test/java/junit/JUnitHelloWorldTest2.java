package junit;

import static org.junit.Assert.assertTrue;
//Commenting for good practice
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitHelloWorldTest2 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test case");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		JUnitHelloWorld tester = new JUnitHelloWorld();
		assertTrue("Num 1 is greater than Num 2", tester.isGreater(4, 3));
	}

	@After
	public void after() {
		System.out.println("After Test Case");
	}
	/**
	 * @wi.implements JunitDemo/JD-391 Test
	 */
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
