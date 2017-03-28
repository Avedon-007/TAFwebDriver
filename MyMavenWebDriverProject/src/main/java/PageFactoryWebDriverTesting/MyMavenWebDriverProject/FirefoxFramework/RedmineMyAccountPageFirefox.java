package PageFactoryWebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class RedmineMyAccountPageFirefox 
{
	private final FirefoxDriver driver;
	
	@FindBy(id = "flash_notice")
	private WebElement flashText;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div[3]/div[1]/p[1]/strong/a")
	private WebElement flashLogInText;
	
	@FindBy(id = "user_language")
	private WebElement userLanguage;
	
	@FindBy(name = "commit")
	private WebElement submitButton;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div[3]/div[2]/h2")
	private WebElement updatedPageNameText;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div[1]/div[1]/ul/li[2]/a")
	private WebElement logOutLink;
	
	@FindBy(xpath = "html/body/div/div/div[1]/div[3]/div[1]/p[2]/a")
	private WebElement deleteAccountPageLink;

	public RedmineMyAccountPageFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getConfirmText() 
	{		
		return flashText.getText();
	}

	public String getLoginText() 
	{		
		return flashLogInText.getText();
	}

	public void updateAccount() throws InterruptedException 
	{
		// Working with Drop down menu
		userLanguage.click();		
		Select se=new Select(userLanguage);
		se.selectByValue("en");
		Thread.sleep(2000);
		submitButton.submit();
	}

	public String getUpdatedPageNameText() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(updatedPageNameText));
		return updatedPageNameText.getText();
	}

	public String getUpdateNotificationText()
	{	
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(flashText));
		return flashText.getText();
	}

	public RedmineHomePageFirefox logOut() 
	{
		logOutLink.click();
		return new RedmineHomePageFirefox(driver);
	}

	public RedmineDeleteConfirmPageFirefox openDeleteAccountPage() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteAccountPageLink));
		deleteAccountPageLink.click();
		return new RedmineDeleteConfirmPageFirefox(driver);
	}
	
}
