package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import java.util.concurrent.TimeUnit;
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

	public String getLoginText() 
	{		
		return driver.findElement(By.className("user active")).getText();
	}

	public void updateAccount() 
	{
		driver.findElement(By.id("user_language")).click();
		driver.findElement(By.id("user_language")).("English");
		driver.findElement(By.name("commit")).submit();
	}

	public Object getUpdatedPageNameText() 
	{
		return driver.findElement(By.name("authenticity_token")).getText();
	}

	public Object getUpdateNotificationText()
	{	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver.findElement(By.id("flash_notice")).getText();
	}
	
}
