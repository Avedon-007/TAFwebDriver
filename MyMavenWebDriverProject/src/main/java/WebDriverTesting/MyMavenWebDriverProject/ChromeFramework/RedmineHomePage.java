package WebDriverTesting.MyMavenWebDriverProject.ChromeFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class RedmineHomePage 
{
	private final ChromeDriver driver;
	
	public RedmineHomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public RedmineRegisterNewIssue signUpNewUser(String string, String string2, String string3, String string4,
			String string5, String string6) 
	{
		driver.findElement(By.id("")).click();
		return new RedmineRegisterNewIssue(driver);
	}

	public RedmineLoginPage logging(String string, String string2) 
	{
		
		return new RedmineLoginPage(driver);
	}
	
}
