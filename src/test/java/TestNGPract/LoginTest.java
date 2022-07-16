package TestNGPract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	By usename = By.id("username");
	By password = By.id("password");
	By login = By.id("loginBtn");
	By signup = By.linkText("Sign up");

	 @BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void signup() {
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
	}

	 @Test(priority = 2)
	public void pageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is:" + title);
		Assert.assertEquals(title, "HubSpot Login");
	}

	//@Test
	public void t2() {
		System.out.println("hi");
	}

	@Test(priority=3)
	public void loginTest() {
		driver.findElement(usename).sendKeys("naveenautomation30@gmail.com");
		driver.findElement(password).sendKeys("Test@1234");
		driver.findElement(login).click();
	}

@AfterTest
	public void teardown() {
		driver.quit();

	}
}
