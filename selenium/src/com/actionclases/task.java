package com.actionclases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		driver.get("https://www.google.com/");
		WebElement wb=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Thread.sleep(2000);
		wb.sendKeys("sathya",Keys.ENTER);
	}

}
