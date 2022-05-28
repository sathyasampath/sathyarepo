package com.webdrvrmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrvr2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.navigate().forward();
		//driver.close(); //it will close active tab only
		driver.quit(); //it will close all tabs currently executing

	}

}
