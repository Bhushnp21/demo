import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
