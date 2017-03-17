package WebDriverTesting.MyMavenWebDriverProject;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineHomePageChrome;
import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineLoginPageChrome;
import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineRegisterNewIssueChrome;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraAccountSettingsPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraHomePage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraLoginPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraProfilePage;





public class RunChrome
{
	private static ChromeDriver driver;
	
	@BeforeClass
	public void setUpDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Programs\\TEST\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
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
		RedmineHomePageChrome startPage = new RedmineHomePageChrome(driver);
		RedmineRegisterNewIssueChrome registerNewIssue = startPage.signUpNewUser("User", "pass", "confirm pass", "name",
				"Last name", "email");
	}
	
	@Test
	public void testUpdateIssue()
	{
		RedmineHomePageChrome startPage = new RedmineHomePageChrome(driver);
		RedmineLoginPageChrome loginPage = startPage.logging("username", "password");
		
		
	}
	
	
}
