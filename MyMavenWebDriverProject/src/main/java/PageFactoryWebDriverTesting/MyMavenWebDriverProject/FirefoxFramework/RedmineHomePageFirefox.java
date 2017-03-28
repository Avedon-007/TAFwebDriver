package PageFactoryWebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RedmineHomePageFirefox 
{
	private final FirefoxDriver driver;
	
	@FindBy(className = "register")
	private WebElement registerLink;
	
	@FindBy(className = "login")
	private WebElement logInLink;

	public RedmineHomePageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public RedmineRegisterNewIssueFirefox openSignUpPage() 
	{		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(registerLink));
		registerLink.click();		
		return new RedmineRegisterNewIssueFirefox(driver);
	}

	public RedmineLoginPageFirefox openLogInPage() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(logInLink));
		logInLink.click();		
		return new RedmineLoginPageFirefox(driver);
	}
}
