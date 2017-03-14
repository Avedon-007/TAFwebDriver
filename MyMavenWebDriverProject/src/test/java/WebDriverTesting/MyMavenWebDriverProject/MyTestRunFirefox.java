package WebDriverTesting.MyMavenWebDriverProject;


import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraAccountSettingsPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraHomePage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraLoginPage;
import WebDriverTesting.MyMavenWebDriverProject.FirefoxFramework.JiraProfilePage;





public class MyTestRunFirefox extends DriverLifecycleManagement
{

	@AfterTest
	public void cleanUp()
	{
		driver.manage().deleteAllCookies();
	}

	@Test
	public void testUpdateIssue()
	{
		
		JiraLoginPage loginStartPage = new JiraLoginPage(driver);
		JiraHomePage homePage = loginStartPage.logging("svv.tes@gmail.com", "1234567890");
		JiraProfilePage profilePage = homePage.openProfile();
		JiraAccountSettingsPage accountSettings = profilePage.openAccountSettings();
		accountSettings.updateAccountPofile("Home");
		AssertJUnit.assertTrue(accountSettings.getOrganization().equals("Home"));
	}
	
	
}
