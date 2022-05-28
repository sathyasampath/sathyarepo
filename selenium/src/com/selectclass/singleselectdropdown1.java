package com.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//select class is a webdrvr class..which performs select n deselect
public class singleselectdropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
	   driver.get("https://www.facebook.com/");  
	   driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	   Thread.sleep(2000);
	  WebElement wb= driver.findElement(By.id("day"));
	   Select sel=new Select(wb);
	   sel.selectByIndex(24);                      //v can use index r value r visibletext our choice
	   WebElement wb1= driver.findElement(By.id("month"));
	   Select sel1=new Select(wb1);        
	   sel1.selectByValue("2");
	   WebElement wb2= driver.findElement(By.id("year"));
	   Select sel2=new Select(wb2);
	   sel2.selectByVisibleText("1993");
	}

}
