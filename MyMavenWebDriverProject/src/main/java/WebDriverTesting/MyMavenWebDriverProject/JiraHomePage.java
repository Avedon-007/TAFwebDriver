package WebDriverTesting.MyMavenWebDriverProject;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JiraHomePage {

	private final FirefoxDriver driver;

	public JiraHomePage(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public JiraProfilePage openProfile() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("header-details-user-fullname")));
		
		driver.findElement(By.id("header-details-user-fullname")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("view_profile")));
		
		driver.findElement(By.id("view_profile")).click();
		
		return new JiraProfilePage(driver);
	}

}
