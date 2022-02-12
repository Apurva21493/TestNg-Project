package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	
	public WebDriver Initialisedriver() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Apurva\\Apurva Gaikwad\\eclipse-workspace\\End2EndDemo\\src\\main\\java\\Resources\\Data.properties");
		Properties prop = new  Properties();
		
		prop.load(file);
		
		String browsername=prop.getProperty("Browser");
		
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apurva\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("Firefox"))
		{
			//firefox code
		}
		
		else if(browsername.equals("InternetExplorer"))
		{
			//IE code
		}
		return driver; //since we will be using this class , we are returning driver here which can be used later.
		
	}
	

}
