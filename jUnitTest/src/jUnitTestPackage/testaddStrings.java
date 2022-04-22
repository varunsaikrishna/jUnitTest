package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		jUnitFunction junitString = new jUnitFunction();
		String result = junitString.addString("capstone", "project");
		assertEquals("capstoneproject", result);
	}
}