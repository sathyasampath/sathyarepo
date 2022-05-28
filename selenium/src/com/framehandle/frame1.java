package com.framehandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/dotnet/index.html");
Thread.sleep(3000);
driver.switchTo().frame("TopicContent");
driver.findElement(By.linkText("Cookie")).click();
driver.switchTo().parentFrame();  //instead of parent v can use defaultcontent too
driver.findElement(By.partialLinkText("IAllowsFileDetection")).click();



	}

}
