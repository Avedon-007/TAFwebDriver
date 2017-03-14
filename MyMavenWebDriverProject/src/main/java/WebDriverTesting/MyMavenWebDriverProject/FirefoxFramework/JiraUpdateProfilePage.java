package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JiraUpdateProfilePage {

	private WebDriver driver;

	public JiraUpdateProfilePage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public Object getOrganization() 
	{
		driver.findElement(By.id(""));
		return null;
	}

}
