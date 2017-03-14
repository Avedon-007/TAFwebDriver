package WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JiraAccountSettingsPage 
{
	private final FirefoxDriver driver;

	public JiraAccountSettingsPage(FirefoxDriver driver) 
	{
		this.driver = driver;
	}

	public void updateAccountPofile(String organization) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		wait.until(ExpectedConditions.elementToBeClickable(By.id("org")));
		
		driver.findElement(By.id("org")).clear();
		driver.findElement(By.id("org")).sendKeys(organization);
		>>driver.findElement(By.className("aui-button aui-button-primary"));
		
	}

	public String getOrganization() 
	{		
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("org")));
		
		return driver.findElement(By.id("org")).getText();
	}
	
	
}
