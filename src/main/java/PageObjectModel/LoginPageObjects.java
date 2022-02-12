package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects 
{
	public WebDriver driver;
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='Login']");
	By SignupBtn= By.xpath("//a[@id='signup_link']");
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
		
	}
	public WebElement EnterUsername()
	{
		return driver.findElement(username);
	}
	public WebElement EnterPassword()
	{
		return driver.findElement(password);
	}
	public WebElement clicklogin()
	{
		return driver.findElement(loginBtn);
	}
	
	public WebElement clickSignup()
	{
		return driver.findElement(SignupBtn);
		
	}

}
