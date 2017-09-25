package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		JUnitFunction JUnitString=new JUnitFunction();
		String result=JUnitString.addString("cai","ro");
		assertEquals("cairo",result);
	}

}
