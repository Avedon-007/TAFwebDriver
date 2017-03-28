package PageFactoryWebDriverTesting.MyMavenWebDriverProject.FirefoxFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedmineRegisterNewIssueFirefox 
{
	private final FirefoxDriver driver;
	
	@FindBy(id = "user_login")
	private WebElement userLogin;
	
	@FindBy(id = "user_password")
	private WebElement userPass;
	
	@FindBy(id = "user_password_confirmation")
	private WebElement userPassConfirm;
	
	@FindBy(id = "user_firstname")
	private WebElement userFirstName;
	
	@FindBy(id = "user_lastname")
	private WebElement userLastName;
	
	@FindBy(id = "user_mail")
	private WebElement userMail;
	
	@FindBy(id = "user_language")
	private WebElement userLanguage;
	
	@FindBy(name = "commit")
	private WebElement submitButton;

	public RedmineRegisterNewIssueFirefox(FirefoxDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public RedmineMyAccountPageFirefox signUpNewUser(String login,
			String pass, String confirmPass, String userName, String lastName,
			String email) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("user_login")));
		userLogin.clear();
		userLogin.sendKeys(login);
		userPass.clear();
		userPass.sendKeys(pass);
		userPassConfirm.clear();
		userPassConfirm.sendKeys(confirmPass);
		userFirstName.clear();
		userFirstName.sendKeys(userName);
		userLastName.clear();
		userLastName.sendKeys(lastName);
		userMail.clear();
		userMail.sendKeys(email);
		
		//Working with Drop down menu
		userLanguage.click();		
		Select se=new Select(userLanguage);
		se.selectByValue("");  // empty value in this case means that we choose Default language (Russian)
		Thread.sleep(2000);
				
		submitButton.submit();		
		
		return new RedmineMyAccountPageFirefox(driver);
	}

}
