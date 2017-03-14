package WebDriverTesting.MyMavenWebDriverProject;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;


public class JiraProfilePage {

	private final FirefoxDriver driver;

	public JiraProfilePage(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public String getUserName()
	{		
		return driver.findElement(By.id("up-user-title-name")).getText();
	}

	public JiraAccountSettingsPage openAccountSettings()
	{
		driver.findElement(By.id("profile")).click();
		return new JiraAccountSettingsPage(driver);
	}

}
