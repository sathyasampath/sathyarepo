package com.webdrvrmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//webdriver is a interface which contains all broswrs specific actions/methods which are already implemented by all browser classes.
public class webdrvr1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver(); //upcasting
	                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
                    driver.get("https://online.actitime.com/ffff");       //navigate to url  
                   driver.findElement(By.id("username")).sendKeys("lokeshwar018eee@gmail.com");
                   driver.findElement(By.name("pwd")).sendKeys("$sQHzVhS");
	              driver.findElement(By.id("loginButton")).click();
	              Thread.sleep(6000);
                  String tp=driver.getTitle();   //gettitle is string return type
                  String curl=driver.getCurrentUrl();
                  String sourcecode=driver.getPageSource();
                  System.out.println("title of actitime"+tp);
                //  System.out.println("title of actitime"+curl);
                //  System.out.println("title of actitime"+sourcecode);
                  }

}
