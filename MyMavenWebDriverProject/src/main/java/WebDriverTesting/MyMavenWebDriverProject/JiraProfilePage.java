package WebDriverTesting.MyMavenWebDriverProject;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JiraProfilePage {

	private final FirefoxDriver driver;

	public JiraProfilePage(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	
	public JiraAccountSettingsPage openAccountSettings()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("profile")));
		
		driver.findElement(By.id("profile")).click();
		return new JiraAccountSettingsPage(driver);
	}

}
