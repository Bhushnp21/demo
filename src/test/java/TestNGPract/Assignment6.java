package TestNGPract;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.id("checkBoxOption2")).click();
		String chkBoxLabl=driver.findElement(By.xpath("//label[normalize-space()='Option2']")).getText();
		System.out.println(chkBoxLabl);
		WebElement dd=driver.findElement(By.id("dropdown-class-example"));
		Select sl=new Select(dd);
		sl.selectByVisibleText(chkBoxLabl);
		driver.findElement(By.id("name")).sendKeys(chkBoxLabl);
		driver.findElement(By.id("alertbtn")).click();
		String alertText=driver.switchTo().alert().getText().split(",")[0].split(" ")[1].trim();
		System.out.println(alertText);
		assertEquals(chkBoxLabl, alertText);
		
		
				
	
	}

}
