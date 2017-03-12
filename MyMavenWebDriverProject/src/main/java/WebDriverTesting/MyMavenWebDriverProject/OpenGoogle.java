package WebDriverTesting.MyMavenWebDriverProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Programs\\TEST\\Selenium\\geckodriver.exe");
		WebDriver myDriver = new FirefoxDriver();
		
		myDriver.get("http://google.com");
		//myDriver.navigate().to("http://google.com");

	}

}
