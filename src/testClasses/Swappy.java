package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Swappy {
	@Test
	void FacebookForgetPassword() {
		maximizeWindow();
		implicitlyWait(10);
		driver.get("https://www.facebook.com/");

string ForgetpasswordactualText = "Forgotten password?"
Assert.assertTrue(FacebookForgetPassword.loginPageLink().isDisplayed());	
String ForgetpasswordactualText=FacebookForgetPassword.loginPageLink().getText();
Assert.assertEquals(Forgotten password?actualText, Forgotten password?expectedText,"Actual value is not matching");}}