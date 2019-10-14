package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "/home/e823409/Driver-master/chromedriver.exe");
  WebDriver driver =new ChromeDriver();
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
