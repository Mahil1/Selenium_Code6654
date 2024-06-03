package day44;

import org.testng.annotations.Test;

public class SignupTests {
	
	@Test(priority=1,groups={"regression"})
	void signbyEmail() {
		System.out.println("this is sign up by email");
	}
	
	@Test(priority=2,groups={"regression"})
	void signupbyFacebook() {
		System.out.println("this is sign up by facebook");
	}
	
	@Test(priority=3,groups={"regression"})
	void signupbyTwitter() {
		System.out.println("this is sign up by twitter");
	}

}
