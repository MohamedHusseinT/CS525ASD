package Lab11.main.java.application;

import Lab11.main.java.framework.Test;
import Lab11.main.java.framework.TestClass;

@TestClass
public class MyTest {
	
	@Test
	public void testMethod1() {
		System.out.println("perform test method 1");
	}

	@Test
	public void testMethod2() {
		System.out.println("perform test method 2");
	}

}
