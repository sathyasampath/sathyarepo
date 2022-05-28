package com.actionclases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//sending keys and selecting text by concurrent ..like two keys at a time..cntl+ v
public class actions4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
	   driver.get("https://www.facebook.com/");       //navigate to url  
	    WebElement wb=driver.findElement(By.id("email"));
	                   wb.sendKeys("lokeshwar018eee@gmail.com");
						/*
						 * Actions act=new Actions(driver);
						 * act.sendKeys(Keys.chord(Keys.CONTROL,"A)).build().perform();
						 */	                   
	wb.sendKeys(Keys.CONTROL,"a"); //now using sendkeys method to perform directly instead of actions class
	wb.sendKeys(Keys.CONTROL,"c");
WebElement wb1=driver.findElement(By.id("pass"));
Thread.sleep(2000);
wb.sendKeys(Keys.TAB);
wb1.sendKeys(Keys.CONTROL,"v");
}

}
