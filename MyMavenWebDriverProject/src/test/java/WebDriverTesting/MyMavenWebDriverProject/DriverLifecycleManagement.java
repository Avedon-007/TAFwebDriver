package WebDriverTesting.MyMavenWebDriverProject;

import java.util.concurrent.TimeUnit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverLifecycleManagement 
{
	protected static FirefoxDriver driver;
	
	@BeforeClass
	public static void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fdefault.jsp");
	}
	
//	@After
//	public void cleanUp()
//	{
//		driver.manage().deleteAllCookies();
//	}
//	
//	@AfterClass
//	public static void tearDown()
//	{
//		driver.close();
//	}
}
