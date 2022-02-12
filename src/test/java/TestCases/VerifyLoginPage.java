package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
//as we need driver object from baseclass ,we need to use inheritance here by extending this class. 

public class VerifyLoginPage extends BaseClass {
	@Test(dataProvider="credentials")
	public void LaunchBrowser(String username, String Password) throws IOException, InterruptedException
	{
		driver=Initialisedriver(); //initialise driver method from base class which will set all the driver properties  and return driver
		driver.get("https://login.salesforce.com/?locale=in");
		LoginPageObjects obj = new LoginPageObjects(driver);
		obj.EnterUsername().sendKeys(username);
		obj.EnterPassword().sendKeys(Password);
		obj.clicklogin().click();
		obj.clickSignup().click();
		driver.navigate().back();
		Thread.sleep(3000);
		
	}
	
	
	
	@DataProvider	
	public Object[][] credentials()
	{
		Object[][] obj = new Object[2][2];
		obj[0][0] = "Apurva";
		obj[0][1] = "Apurva123";
		obj[1][0] = "Selenium";
		obj[1][1] = "Selenium123";
		
		
		return obj;
		
	}
	

}
