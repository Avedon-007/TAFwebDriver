package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RedmineHomePageFirefox 
{
	private final FirefoxDriver driver;

	public RedmineHomePageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineRegisterNewIssueFirefox openSignUpPage() 
	{		
		driver.findElement(By.className("register")).click();		
		return new RedmineRegisterNewIssueFirefox(driver);
	}

	public RedmineLoginPageFirefox openLogInPage() 
	{
		driver.findElement(By.className("login")).click();		
		return new RedmineLoginPageFirefox(driver);
	}
}
