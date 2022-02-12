package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;

public class VerifySignupPage extends BaseClass
{
	@Test
	public void fillSignupForm() throws IOException 
	{
		driver=Initialisedriver(); //initialise driver method from base class which will set all the driver properties  and return driver
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		SignUpPageObjects A = new SignUpPageObjects(driver);
		A.enterfirstname().sendKeys("Apurva");
		A.enterlastname().sendKeys("Gaikwad");
		A.enterworkemail().sendKeys("apurva123@gmail.com");
		A.selectjobtitle("Developer");
		A.entercompanyname().sendKeys("TCS");
		A.selectEmpNo(3);
		A.Enterphone().sendKeys("9028899921");
		A.selectCountry("India");
		A.checkbox().click();
		A.Signupbutton().click();
		
		
	}
	
	

}
