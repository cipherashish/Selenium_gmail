package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver.exe"); // <– Change this path
	ChromeOptions options = new ChromeOptions();
	options.addArguments("headless");
	options.addArguments("no-sandbox");
	options.addArguments("disable-dev-shm-usage");
	options.addArguments("window-size=1200x600");
	WebDriver driver = new ChromeDriver(options);
  driver.get("http://www.gmail.com/");
  driver.manage().window().maximize();
  driver.findElement(By.id("identifierId")).sendKeys("@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.className("CwaK9")).click();
  Thread.sleep(2000);
String at =driver.getTitle();
String et ="no";//expected title
driver.close();


//establish test condition

if(at.equalsIgnoreCase(et))
{
	System.out.println("test successful");
}

else {
	System.out.println("test failure");
}
	}

}
