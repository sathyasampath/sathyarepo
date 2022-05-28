 package com.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderpopup {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
	
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/flights");
	driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal']")).click();
	driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
	/*
	 * driver.findElement(By.xpath("//label[@for='toCity']/span[@class='lbl_input latoBold  appendBottom5']"
	 * )); driver.findElement(By.id("toCity")).sendKeys("Banga");
	 * driver.findElement(By.xpath("//p[contains(text(),'Bengaluru)')]")).click();
	 */
	Thread.sleep(6000);
	int n=1;
	while(n<12)
	{
		try {
	driver.findElement(By.xpath("//div[@aria-label='Tue Aug 16 2022']")).click();
	break;
	}catch(Exception e)
	{
	driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();	
	}

	}
	}}