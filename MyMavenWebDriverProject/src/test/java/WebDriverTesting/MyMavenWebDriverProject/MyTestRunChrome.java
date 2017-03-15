package WebDriverTesting.MyMavenWebDriverProject;


import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.RedmineHomePage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraAccountSettingsPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraHomePage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraLoginPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraProfilePage;





public class MyTestRunChrome extends DriverLifecycleManagement
{

	@AfterTest
	public void cleanUp()
	{
		driver.manage().deleteAllCookies();
	}

	@Test
	public void testUpdateIssue()
	{
		RedmineHomePage srartPage = new RedmineHomePage(driver);
		
		
	}
	
	
}
