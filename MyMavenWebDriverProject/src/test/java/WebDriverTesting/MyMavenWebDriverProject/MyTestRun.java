package WebDriverTesting.MyMavenWebDriverProject;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;




public class MyTestRun extends DriverLifecycleManagement
{
//	@Before
//	public void startBrowser()
//	{
//		driver.get("https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fdefault.jsp");
//	}
//	
	@After
	public void cleanUp()
	{
		driver.manage().deleteAllCookies();
	}
	
//	@Test
//	public void testCreateNewIssue()
//	{
//		JiraLoginPage loginStartPage = new JiraLoginPage(driver);
//		JiraSignUpPage signUpPage = loginStartPage.signUpNewUser();
//		JiraHomePage homePage = signUpPage.loggeing("a_n_d_y-007@mail.ru", "tester1", "1234567890");
//		JiraProfilePage profilePage = homePage.openProfile();
//		AssertJUnit.assertTrue(profilePage.getUserName().equals("tester1"));
//	}
	
	@Test
	public void testUpdateIssue()
	{
		
		JiraLoginPage loginStartPage = new JiraLoginPage(driver);
		JiraHomePage homePage = loginStartPage.logging("svv.tes@gmail.com", "1234567890");
//		JiraProfilePage profilePage = homePage.openProfile();
//		JiraAccountSettingsPage accountSettings = profilePage.openAccountSettings();
//		accountSettings.updateAccountPofile("Home");
//		AssertJUnit.assertTrue(accountSettings.getOrganization().equals("Home"));
	}
	
	@Test
	public void testSearchIssue()
	{
		
	}
}
