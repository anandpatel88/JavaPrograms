package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().refresh();
		driver.navigate().to("https://email.accenture.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
		

	}

}
