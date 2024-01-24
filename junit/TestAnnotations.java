package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotations {

	@Test
	public void test1() {
		System.out.println("Test case1 : inside test case");
		}
	
	@Before
	public void test2() {
		System.out.println("Test case2 : inside before");
		}
	
	@After
	public void test3() {
		System.out.println("Test case3 : inside after");
		}
	
	@Ignore
	public void test4() {
		System.out.println("test case 4 will not execute");
		}
	@BeforeClass
	public static void test5() {
		System.out.println("Test case5 : inside beforeClass");
		}
	@AfterClass
	public  static void test6() {
		System.out.println("Test case6 : inside AfterClass");
		}

}
