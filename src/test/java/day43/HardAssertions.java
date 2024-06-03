package day43;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	
	@Test
	void Test() {
		
		//1 Assert Equals/NotEquals- it is used to verify compare two value like two strings, two value, string & numbers
		Assert.assertEquals("xyz","xyz"); //pass
		Assert.assertEquals(123,345);     //fail
		Assert.assertEquals("xyz",123);   //fail
		Assert.assertEquals("123",123);   //fail because expected number is string & actual number is numeric
		
		Assert.assertNotEquals(123, 123); //fail
		Assert.assertNotEquals(123,345);  //pass
		
		//2 Assert True/False-
		Assert.assertTrue(true); //pass because we r expecting true, we r also passing true
		Assert.assertTrue(false); //fail because we r expecting true, but we r also passing false
		
		Assert.assertTrue(1==2); //fail
		Assert.assertTrue(1==1); //pass
		
		Assert.assertFalse(1==2); //pass
		Assert.assertTrue(1==1);  //fail
		
		//3 Assert Fail-if u want to fail our test method intentionally
		
		
	}

}
