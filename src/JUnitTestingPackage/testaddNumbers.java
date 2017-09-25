package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNumbers {

	@Test
	public void test() {
		JUnitFunction JUnit=new JUnitFunction();
		int result=JUnit.addNumbers(101,200);
		assertEquals(301,result);
	}

}
