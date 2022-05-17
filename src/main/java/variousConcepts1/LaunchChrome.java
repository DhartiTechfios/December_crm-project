package variousConcepts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	static WebDriver driver; // create global variable.

	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		tearDown();

		launchBrowser();
		negloginTestusername();
		tearDown();

		launchBrowser();
		negloginTestpassword();
		tearDown();

	}

	public static void launchBrowser() {
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

	public static void loginTest() {
		// identify username element & data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc123");
		// locate the sign in button & click on it.
		driver.findElement(By.name("login")).click();

	}

	public static void negloginTestusername() {
		// identify username element & data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios1.com");
		// identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc123");
		// locate the sign in button & click on it.
		driver.findElement(By.name("login")).click();
	}

	public static void negloginTestpassword() {
		// identify username element & data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc123456");
		// locate the sign in button & click on it.
		driver.findElement(By.name("login")).click();
	}

	public static void tearDown() {
		// close browser
		driver.close();
	}
}
