package com.testngprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//imp how to upload file
public class fileuploadusingrobot {
@Test
public void fileupload_testdoc() throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver(); //upcasting
	                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	driver.get("https://www.grammarly.com/plagiarism-checker");
	JavascriptExecutor js=(JavascriptExecutor)driver;  //doing downcasting
	js.executeScript("window.scrollBy(0,200)", "");
	driver.findElement(By.xpath("//div[text()='Upload a file']")).click();
	Thread.sleep(2000);
	//create obj of robot class
	Robot rw=new Robot();                            //robust class used to uplaod file in webpage
	//copying filepath to clipboard
	StringSelection str=new StringSelection("\"F:\\Hi hru.docx\"");   
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);//tat file open optin is this v use toolkit method in stringselection
	//press cntrl v for paste the file
	rw.keyPress(KeyEvent.VK_CONTROL);
	rw.keyPress(KeyEvent.VK_V);
	//release cntrl v for pasting
	rw.keyRelease(KeyEvent.VK_CONTROL);
	rw.keyRelease(KeyEvent.VK_V);
	//press and release enter key
	rw.keyPress(KeyEvent.VK_ENTER);
	rw.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
}
}
