package WebDriverTesting.MyMavenWebDriverProject;


import static org.testng.AssertJUnit.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineHomePageChrome;
import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineLoginPageChrome;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.RedmineHomePageFirefox;
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
	
	@AfterTest
	public void cleanUp()
	{
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public static void tearDown()
	{
		driver.close();
	}
	
	
	@Test
	public void testCreateNewIssue()
	{		
		RedmineHomePageFirefox startPage = new RedmineHomePageFirefox(driver);
		RedmineRegisterNewIssueFirefox registerNewIssue = startPage.openSignUpPage();
		RedmineMyAccountPageFirefox myAccount = registerNewIssue
				.signUpNewUser("test-user-1", "1234567890", "1234567890", "user",
				"userenko", "a_n_d_y-007@mail.ru");
		assertTrue(myAccount.getConfirmText().equals("Account was successfully updated."));			
		assertTrue(myAccount.getLoginTest().equals("test-user-1"));
				
				
	}
	
	@Test
	public void testUpdateIssue()
	{
		RedmineHomePageFirefox startPage = new RedmineHomePageFirefox(driver);
		RedmineLoginPageFirefox loginPage = startPage.logging("username", "password");
		
		
	}
	
}
