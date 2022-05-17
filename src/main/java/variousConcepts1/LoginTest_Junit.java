package variousConcepts1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	WebDriver driver;
	
		@BeforeClass
	public static void beforeclass() {
		
		System.out.println("before Class");
	}

	@AfterClass
	public static void afterclass() {
		System.out.println("after Class");
	}

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhart\\selenium\\1st_Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// delete the cookies
		driver.manage().deleteAllCookies();
		// go to the techfios site
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		// to maximize window
		driver.manage().window().maximize();

	}

	@Test
	public void loginTest() {
		// identify username element & data insertion
		System.out.println("test method");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc123");
		// locate the sign in button & click on it.
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void negloginTest() {
		// identify username element & data insertion
		System.out.println("negtest method");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc12345678");
		// locate the sign in button & click on it.
		driver.findElement(By.name("login")).click();
	}

	public void negloginTestusername() {
		System.out.println("negtest method");
		// identify username element & data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios1.com");
		// identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc123");
		// locate the sign in button & click on it.
		driver.findElement(By.name("login1")).click();
	}

	@After
	public void tearDown() {
		// close browser
		System.out.println("after method");
		driver.close();
		driver.quit();
	}
}