package PageFactoryWebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedmineLoggedInPageFirefox 
{
	private final FirefoxDriver driver;
	
	@FindBy(className = "my-account")
	private WebElement myAccountlink;

	public RedmineLoggedInPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public RedmineMyAccountPageFirefox openAccoutPage() 
	{
		myAccountlink.click();
		return new RedmineMyAccountPageFirefox(driver);
	}

}
