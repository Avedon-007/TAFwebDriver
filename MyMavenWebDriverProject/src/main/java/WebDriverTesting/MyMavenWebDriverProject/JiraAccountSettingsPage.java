package WebDriverTesting.MyMavenWebDriverProject;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class JiraAccountSettingsPage 
{
	private final FirefoxDriver driver;

	public JiraAccountSettingsPage(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public void updateAccountPofile(String organization) 
	{
		driver.findElement(By.id("org")).clear();
		driver.findElement(By.id("org")).sendKeys(organization);
		
	}

	public String getOrganization() 
	{		
		return driver.findElement(By.id("org")).getText();
	}
	
	
}
