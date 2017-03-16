package WebDriverTesting.MyMavenWebDriverProject;


import static org.testng.AssertJUnit.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.RedmineHomePageFirefox;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.RedmineLoggedInPageFirefox;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.RedmineLoginPageFirefox;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.RedmineMyAccountPageFirefox;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.RedmineRegisterNewIssueFirefox;


public class MyTestRunFirefox 
{
	private static FirefoxDriver driver;
	
	@BeforeClass
	public void setUpDriver()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Programs\\TEST\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.redmine.org/");
	}	
	
	@AfterMethod
	public void cleanUp()
	{
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown()
	{
		driver.close();
	}	
	
//	@Test
//	public void testCreateNewIssue()
//	{		
//		RedmineHomePageFirefox startPage = new RedmineHomePageFirefox(driver);
//		RedmineRegisterNewIssueFirefox registerNewIssue = startPage.openSignUpPage();
//		RedmineMyAccountPageFirefox myAccount = registerNewIssue
//				.signUpNewUser("test-user-1", "1234567890", "1234567890", "user",
//				"userenko", "testuser1@gmail.con");
//		assertTrue(myAccount.getConfirmText().equals("Ваша учётная запись активирована. Вы можете войти."));			
//		assertTrue(myAccount.getLoginText().equals("test-user-1"));				
//	}
//	
		
	
	
	@Test
	public void testUpdateIssue() throws InterruptedException
	{
		RedmineHomePageFirefox startPage = new RedmineHomePageFirefox(driver);
		RedmineLoginPageFirefox loginPage = startPage.openLogInPage();
		RedmineLoggedInPageFirefox loggedPage = loginPage.logging("test-user-1", "1234567890");
		RedmineMyAccountPageFirefox myAccount = loggedPage.openAccoutPage();
		myAccount.updateAccount();
		assertTrue(myAccount.getUpdateNotificationText().equals("Account was successfully updated."));
		assertTrue(myAccount.getUpdatedPageNameText().equals("My account"));
	}
	
	
	
}
