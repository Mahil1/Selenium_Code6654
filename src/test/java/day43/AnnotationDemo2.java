package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* Login  --@BeforeClass
 * Search --@Test
 * Advance Search --@Test
 * Logout --@AfterClass
*/

public class AnnotationDemo2 {
	
	@BeforeClass
	void login() {
		System.out.println("This is login.......");
	}
	@AfterClass
	void logout() {
		System.out.println("This is logout");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("This is search......");
	}
   
	@Test(priority=2)
	void advanceSearch() {
		System.out.println("This is advance search.......");
	}
	

}
