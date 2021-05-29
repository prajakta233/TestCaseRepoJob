package PragatiTraining.TestCaseProject.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import PragatiTraining.TestCaseProject.Pages.LoginPage;

public class LoginTestCases {
	LoginPage pg1;
	
	@BeforeClass
	@Parameters({"Browser"})
	public void Init() {
		pg1=new LoginPage("CHROME");
		
	}
	@Test
	public void TestLoginWithValidCredential() {
		
		/*
		 * 1. Open broswer
		 * 2. Open URL
		 * 3. Enter "mercury" in Username field
		 * 4. Enter "mercury" in password field
		 * 5. click on SignIn button
		 * 6. Verify Welcome screen appears
		 */
		pg1.DoLogin("", "");
		
	}
	@Test
	public void TestLoginWithUsernameFieldBlank() {
		
		pg1.EnterUserName("");
		pg1.ClickSignInButton();
		
	}
	@Test
	
	public void TestLoginWithPasswordFieldBlank() {
		
		pg1.EnterPassword("");
		pg1.ClickSignInButton();
		
	}
	
	

}
