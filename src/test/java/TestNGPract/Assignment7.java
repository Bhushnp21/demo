package TestNGPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		int totalrows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size();
		System.out.println("total no of rows are:"+totalrows);
		int totalcols=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th")).size();
		System.out.println("total no of columns are:"+totalcols);
        for(int i=0;i<totalcols;i++)
        {
        	System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td")).get(i).getText());
        }
		
	}

}
