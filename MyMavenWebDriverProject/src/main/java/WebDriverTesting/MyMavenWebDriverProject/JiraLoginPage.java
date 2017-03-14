package WebDriverTesting.MyMavenWebDriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JiraLoginPage 
{	
	private final FirefoxDriver driver;

	public JiraLoginPage(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	
	public JiraHomePage logging(String email, String pass) 
	{
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("login-submit")).click();
		return new JiraHomePage(driver);
	}

	public JiraSignUpPage signUpNewUser()
	{
		
		return new JiraSignUpPage(driver);
	}

}
