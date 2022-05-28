package com.webdrvrmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelemnt1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
	   driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");       //navigate to url  
	    WebElement wb=driver.findElement(By.name("identifier"));
	                   wb.sendKeys("lokeshwar018eee@gmail.com");
	                   driver.findElement(By.xpath("//span[text()='Next']")).click();
	                   Thread.sleep(3000);
	                   wb.clear();
	                   driver.close();
	}

}
