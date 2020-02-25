package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown850 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zkharazmi.S1F\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		driver.findElement(By.xpath("//*[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='MAA']")).click();
		
		
		//*[@value='MAA']
		//*[@value='BLR']
		
	}

}
