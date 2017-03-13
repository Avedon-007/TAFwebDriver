package WebDriverTesting.MyMavenWebDriverProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;




public class MyTestRun extends DriverLifecycleManagement
{
	@Test
	public void TestCreateNewIssue()
	{
		JiraLoginPage loginStartPage = new JiraLoginPage(driver);
		JiraSignUpPage signUpPage = loginStartPage.signUpNewUser();
		JiraHomePage homePage = signUpPage.loggeing("a_n_d_y-007@mail.ru", "tester1", "1234567890");
		JiraProfilePage profilePage = homePage.openProfile();
		AssertJUnit.assertTrue(profilePage.getUserName().equals("tester1"));
	}
	
	@Test
	public void TestUpdateIssue()
	{
		JiraLoginPage loginStartPage = new JiraLoginPage(driver);
		JiraHomePage homePage = loginStartPage.loggeing("svv.tes@gmail.com", "1234567890");
		JiraProfilePage profilePage = homePage.openProfile();
		JiraUpdateProfilePage updateProfile = profilePage.updateAccountPofile("Home");
		AssertJUnit.assertTrue(updateProfile.getOrganization().equals("Home"));
	}
	
	@Test
	public void TestSearchIssue()
	{
		
	}
}
