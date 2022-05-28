package com.testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//paralell exe/concurrnt exe is distrt r exectng tc with multiple broswers called 
//adv saves exe tym
//3 browsers opening at a time
//have to change in xml..thread count="3"..this threadcount should b same r grte than test runner
//testng3a its xml file here
//max 5 browser v can launch at a tym..threadcount="5"
public class parallelexe1 {
	@Test
	public void parell() {
	String Expectedtext="Facebook helps you connect and share with the people in your life";
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver(); //upcasting
	                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
   driver.get("https://www.facebook.com/");
   String Actualtext= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
}
}