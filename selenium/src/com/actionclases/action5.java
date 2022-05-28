package com.actionclases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class action5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='Drag me to my target']"))));
         //Thread.sleep(2000);
		WebElement wb1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement wb2=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		//act.dragAndDrop(wb1,wb2).build().perform();
			act.clickAndHold(wb1).moveToElement(wb2).build().perform();
		
		
	}

}
