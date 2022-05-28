package com.actionclases;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//action is interface
//actionS is class
public class actions3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
WebElement wb=driver.findElement(By.xpath("//h2[text()='Deals of the Day']"));
WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.visibilityOf(wb));
	Actions act=new Actions(driver);
	act.doubleClick(wb).build().perform();
	}

}
