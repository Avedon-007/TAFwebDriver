package WebDriverTesting.MyMavenWebDriverProject;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverLifecycleManagement 
{
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://id.atlassian.com/login");
	}
	
	@After
	public void cleanUp()
	{
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public static void tearDown()
	{
		driver.close();
	}
}
