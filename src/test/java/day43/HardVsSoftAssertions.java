package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	//@Test
	void test_hardAssertions() {
		System.out.println("testing 1.....");
		System.out.println("testing 2.....");
		
		Assert.assertEquals(1,2); //hard assertion
		
		System.out.println("testing 3.....");
		System.out.println("testing 4.....");
		
	}
	
	@Test
	void test_softAssertions() {
		System.out.println("testing 1.....");
		System.out.println("testing 2.....");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,2); //soft assertion
		
		System.out.println("testing 3.....");
		System.out.println("testing 4.....");
		sa.assertAll();   //it is mandatory at the end of test method otherwise soft assertion will show pass
		
	}

}
