package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedmineRegisterNewIssueFirefox 
{
	private final FirefoxDriver driver;

	public RedmineRegisterNewIssueFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	
	public RedmineMyAccountPageFirefox signUpNewUser(String login,
			String pass, String confirmPass, String userName, String lastName,
			String email) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
//		Select dropdown = new Select(driver.findElement(By.id("user_language")));	// 2-й вариант
//		dropdown.selectByVisibleText("Russian (Русский)");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("user_login")));
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys(login);
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys(pass);
		driver.findElement(By.id("user_password_confirmation")).clear();
		driver.findElement(By.id("user_password_confirmation")).sendKeys(confirmPass);
		driver.findElement(By.id("user_firstname")).clear();
		driver.findElement(By.id("user_firstname")).sendKeys(userName);
		driver.findElement(By.id("user_lastname")).clear();
		driver.findElement(By.id("user_lastname")).sendKeys(lastName);
		driver.findElement(By.id("user_mail")).clear();
		driver.findElement(By.id("user_mail")).sendKeys(email);
		
		driver.findElement(By.id("user_language")).click();
		//driver.findElement(By.name=user[language] value=en)).click();	// 1-й вариант
		
		
		
		Select se=new Select(driver.findElement(By.name("Sex[0]")));
		se.selectByValue("en");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.name("commit")).submit();		
		
		return new RedmineMyAccountPageFirefox(driver);
	}

}
