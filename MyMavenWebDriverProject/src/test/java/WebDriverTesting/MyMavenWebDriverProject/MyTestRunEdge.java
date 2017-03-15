package WebDriverTesting.MyMavenWebDriverProject;


import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebDriverTesting.MyMavenWebDriverProject.ChromeFramework.LeantestingStartPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraAccountSettingsPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraHomePage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraLoginPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraProfilePage;





public class MyTestRunEdge extends DriverLifecycleManagement
{

	@AfterTest
	public void cleanUp()
	{
		driver.manage().deleteAllCookies();
	}

	@Test
	public void testUpdateIssue()
	{
		LeantestingStartPage srartPage = new LeantestingStartPage(driver);
		JiraHomePage homePage = loginStartPage.logging("a_n_d_y-007@mail.ru", tester-user-1, "1234567890");
		
	}
	
	
}
