package WebDriverTesting.MyMavenWebDriverProject;


import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;





public class MyTestRun extends DriverLifecycleManagement
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
