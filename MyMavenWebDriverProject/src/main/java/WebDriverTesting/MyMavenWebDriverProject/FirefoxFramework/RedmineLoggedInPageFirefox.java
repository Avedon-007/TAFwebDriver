package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RedmineLoggedInPageFirefox 
{

	private final FirefoxDriver driver;

	public RedmineLoggedInPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineMyAccountPageFirefox openAccoutPage() 
	{
		// TODO Auto-generated method stub
		return new RedmineMyAccountPageFirefox(driver);
	}

}
