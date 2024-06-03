package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void testTitle() {
		
		String expectedTitle="opencart";
		String actualTitle="openshop";
		
		/* 1 using conditional statement 
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test passed");
		}
		
		else {
			System.out.println("test failed");
		}
		*/
		
		/* 2 using assert equals- this assertion will compare two value
		Assert.assertEquals(expectedTitle,actualTitle);
		*/
		
		// 3 using assertTrue:- if u want to use assertion with conditional statement & this assertion will take boolean value as parameter
		// if u want to print in console window, u can go for this assertion
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		
		else {
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
	}
}
