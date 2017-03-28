package PageFactoryWebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedmineLoginPageFirefox 
{
	private final FirefoxDriver driver;
	
	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement LogInButton;

	public RedmineLoginPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public RedmineLoggedInPageFirefox logging(String login, String pass) 
	{
		userName.clear();
		userName.sendKeys(login);
		password.clear();
		password.sendKeys(pass);
		LogInButton.submit();
		
		return new RedmineLoggedInPageFirefox(driver);
	}

}
