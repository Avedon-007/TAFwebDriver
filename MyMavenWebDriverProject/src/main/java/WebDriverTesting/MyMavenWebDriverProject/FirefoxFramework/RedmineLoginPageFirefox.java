package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RedmineLoginPageFirefox 
{

	private final FirefoxDriver driver;

	public RedmineLoginPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public RedmineLoggedInPageFirefox logging(String string, String string2) 
	{
		// TODO Auto-generated method stub
		return new RedmineLoggedInPageFirefox(driver);
	}

}
