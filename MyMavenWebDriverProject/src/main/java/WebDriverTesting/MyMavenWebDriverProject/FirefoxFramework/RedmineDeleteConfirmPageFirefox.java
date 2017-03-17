package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RedmineDeleteConfirmPageFirefox 
{

private final FirefoxDriver driver;
	

	public RedmineDeleteConfirmPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
	}


	public void deleteAccounr() 
	{		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/label/input")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/input[3]")).click();		
	}

}
