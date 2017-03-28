package PageFactoryWebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RedmineDeleteConfirmPageFirefox 
{
	private final FirefoxDriver driver;
	
	@FindBy(id = "confirm")
	private WebElement deleteAccountCheckbox;
	
	@FindBy(name = "commit")
	private WebElement deleteAccountButton;
	

	public RedmineDeleteConfirmPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void deleteAccounr() 
	{		
		WebDriverWait wait = new WebDriverWait(driver, 30);		
		
		wait.until(ExpectedConditions.elementToBeClickable(deleteAccountCheckbox));		
		deleteAccountCheckbox.click();		
		deleteAccountButton.click();
	}

}
