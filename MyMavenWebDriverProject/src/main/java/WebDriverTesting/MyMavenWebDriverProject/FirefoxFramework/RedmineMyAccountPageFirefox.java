package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedmineMyAccountPageFirefox 
{
	private final FirefoxDriver driver;

	public RedmineMyAccountPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public String getConfirmText() 
	{		
		return driver.findElement(By.id("flash_notice")).getText();
	}

	public String getLoginTest() 
	{		
		return driver.findElement(By.className("user active")).getText();
	}

	public void updateAccount() 
	{
		// TODO Auto-generated method stub
		
	}

	public Object getUpdatedPageNameText() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object getUpdateNotificationText()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
