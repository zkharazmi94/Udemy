package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zkharazmi.S1F\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("[title*='Sign in']")).click();
	    driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("hello");
	    driver.findElement(By.cssSelector("#password")).sendKeys("hello");
	    driver.findElement(By.cssSelector("[value*='Sign in']")).click();

	}

}
