package WebDriverTesting.MyMavenWebDriverProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverLifecycleManagement 
{
	protected static FirefoxDriver driver;
	
	@BeforeClass
	public static void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Programs\\TEST\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fdefault.jsp");
	}
	

	@AfterClass
	public static void tearDown()
	{
		driver.close();
	}
}
