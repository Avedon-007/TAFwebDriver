package WebDriverTesting.MyMavenWebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JiraLoginPage 
{	
	private final FirefoxDriver driver;

	public JiraLoginPage(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	
	public JiraHomePage logging(String email, String pass) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("login-submit")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("login-submit")).click();
		return new JiraHomePage(driver);
	}

	
}
