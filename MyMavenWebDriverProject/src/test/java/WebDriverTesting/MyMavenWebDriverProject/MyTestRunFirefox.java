package WebDriverTesting.MyMavenWebDriverProject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.RedmineHomePageFirefox;






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
	public void testUpdateIssue()
	{
		
		RedmineHomePageFirefox startPage = new RedmineHomePageFirefox(driver);
		RedmineRegisterNewIssueChrome registerNewIssue = startPage.signUpNewUser("User", "pass", "confirm pass", "name",
				"Last name", "email");
	}
	
	
}
