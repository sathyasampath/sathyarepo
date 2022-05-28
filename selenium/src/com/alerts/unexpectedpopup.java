package com.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class unexpectedpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/flights");
	Thread.sleep(2000);
	try {
	driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	}catch(Exception e) {
		System.out.println("popup not displayng"); //it will cum wen popup not there..now popup there so it wil not cum
	}

	}

}
