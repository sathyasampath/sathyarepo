package com.actionclases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//contextclick is for rightclick
//inn cssselector use class n id directly but . for class n # for id
public class rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
WebElement wb=driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral")); //in cssselector . use for class
Actions act=new Actions(driver);
act.contextClick(wb).build().perform();
String copy=driver.findElement(By.cssSelector(".context-menu-icon-copy")).getText();
System.out.println(copy);
	}

}
