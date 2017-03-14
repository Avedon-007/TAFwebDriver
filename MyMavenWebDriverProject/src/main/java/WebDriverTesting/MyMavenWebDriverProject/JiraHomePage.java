package WebDriverTesting.MyMavenWebDriverProject;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class JiraHomePage {

	private final FirefoxDriver driver;

	public JiraHomePage(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public JiraProfilePage openProfile() 
	{
		driver.findElement(By.id("header-details-user-fullname")).click();
		driver.findElement(By.id("view_profile")).click();
		return new JiraProfilePage(driver);
	}

}
