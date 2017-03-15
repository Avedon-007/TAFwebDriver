package WebDriverTesting.MyMavenWebDriverProject;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineHomePage;
import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineLoginPage;
import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineRegisterNewIssue;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraAccountSettingsPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraHomePage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraLoginPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraProfilePage;





public class MyTestRunChrome 
//extends DriverLifecycleManagement
{
	private static ChromeDriver driver;
	
	@BeforeClass
	public void setUpDriver()
	{
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
		RedmineHomePage startPage = new RedmineHomePage(driver);
//		RedmineRegisterNewIssue registerNewIssue = startPage.signUpNewUser("User", "pass", "confirm pass", "name",
//				"Last name", "email");
	}
	
//	@Test
//	public void testUpdateIssue()
//	{
//		RedmineHomePage startPage = new RedmineHomePage(driver);
//		RedmineLoginPage loginPage = startPage.logging("username", "password");
//		
//		
//	}
	
	
}
