package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.firefox.FirefoxDriver;

public class RedmineRegisterNewIssueFirefox 
{
	private final FirefoxDriver driver;

	public RedmineRegisterNewIssueFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	
	public RedmineMyAccountPageFirefox signUpNewUser(String login,
			String pass, String confirmPass, String userName, String lastName,
			String email) {
		
		return new RedmineMyAccountPageFirefox(driver);
	}

}
