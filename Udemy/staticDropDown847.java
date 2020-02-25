package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticDropDown847 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Zkharazmi.S1F\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/input")).getText());
		
		/*
		int i = 1;
		while(i<5) 
		{
			driver.findElement(By.xpath("//*[@class='increment']")).click();
			i++;
		}
		*/
		
		for(int i=1;i<5;i++) {
			
			driver.findElement(By.xpath("//*[@class='increment']")).click();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/input")).getText());
		}

	}
}