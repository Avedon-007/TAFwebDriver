package WebDriverTesting.MyMavenWebDriverProject.InterExplorerFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RedmineDeleteConfirmPage 
{

	private final InternetExplorerDriver driver;
	

	public RedmineDeleteConfirmPage(InternetExplorerDriver driver) 
	{
		this.driver = driver;
	}


	public void deleteAccounr() 
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("confirm")).click();
		driver.findElement(By.id("commit")).click();
		
	}
	
	
}
