package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertion {

	@Test
	public void test() {
		int a = 10;
		int b = 20;
		
		String str1 = new String("Raj");
		String str2 = new String("Raj");
		
		String str3 = "Welcome";
		String str4 = "Welcome";
		String str5 = null;
		
		assertNotSame(str1,str2);
		
		assertSame(str3,str4);
		
		assertTrue(a==b);
		
		assertFalse(a==b);
		
		assertNull(str5);
		
		assertNotNull(str1);
		
		String a1[]= {"one","two","three"};
		
		String a2[]= {"one","two","three"};
		
		assertArrayEquals(a1,a2);
		
		
	}

}
