package WebDriverTesting.MyMavenWebDriverProject.ChromeFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;






public class RedmineHomePageChrome 
{
	private final ChromeDriver driver;
	
	public RedmineHomePageChrome(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public RedmineRegisterNewIssueChrome signUpNewUser(String string, String string2, String string3, String string4,
			String string5, String string6) 
	{
		driver.findElement(By.id("")).click();
		return new RedmineRegisterNewIssueChrome(driver);
	}

	public RedmineLoginPageChrome logging(String string, String string2) 
	{
		
		return new RedmineLoginPageChrome(driver);
	}
	
}
