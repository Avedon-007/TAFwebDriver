package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

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
		// TODO Auto-generated method stub
		return new RedmineRegisterNewIssueFirefox(driver);
	}

	

}
