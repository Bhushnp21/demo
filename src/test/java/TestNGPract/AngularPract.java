package TestNGPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPract {

	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
		  driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Bhushan");
		  driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test123@gmail.com");
		  driver.findElement(By.id("exampleInputPassword1")).sendKeys("test123456");
		  driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		  WebElement genderdropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		  Select dd= new Select(genderdropdown);
		  dd.selectByVisibleText("Male");
		  driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		  driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("20-05-1998");
		  driver.findElement(By.cssSelector("input[value='Submit']")).click();
		  System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	       driver.close();

	}

}




