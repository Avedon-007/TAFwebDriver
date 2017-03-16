package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("register")).click();		
		return new RedmineRegisterNewIssueFirefox(driver);
	}

	public RedmineLoginPageFirefox openLogInPage() 
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("login")).click();		
		return new RedmineLoginPageFirefox(driver);
	}
}
