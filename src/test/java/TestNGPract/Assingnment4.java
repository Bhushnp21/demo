package TestNGPract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingnment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> wh= driver.getWindowHandles();
		Iterator<String> it= wh.iterator();
		String parentWin=it.next();
		String childWin=it.next();
		driver.switchTo().window(childWin);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.switchTo().window(parentWin);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.close();
		

		
		
	}

}
