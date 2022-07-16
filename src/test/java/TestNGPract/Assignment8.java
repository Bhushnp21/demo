package TestNGPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
	    driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("ind");
	    Thread.sleep(5000);
	    List<WebElement> as = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
         
	    for(WebElement option : as)
	    {
	    	if(option.getText().equalsIgnoreCase("India"))
	    
	    {
	    option.click();
	    break;
	    }
	    	
  	}
	    System.out.println(driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).getAttribute("value"));
	    driver.close();
	  	}
	
}
