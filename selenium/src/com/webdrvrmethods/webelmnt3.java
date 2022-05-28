package com.webdrvrmethods;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
//thread.sleep-normal wait ..rarely used
//implicit wait-it will one page to load
//explixit wait-it will wait for tat specific elelmt(withtimout,pollingevery)
//pageloadtimeout cmnd-sumtyms timout will hpn..then use this cmnd
//fluentwait cmnd-(withtimout,pollingevery,wait.ignoringexception )
public class webelmnt3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
	                    driver.get("https://online.actitime.com/ffff");    
	                    WebElement wb=driver.findElement(By.id("keepLoggedInCheckBox"));
	                    wb.click();  //it will select the checkbox
	                    boolean issel=wb.isSelected(); //it will check selected r nt
	                    System.out.println("clicked checkcbox succesfuly =="+issel);//selectec so true
                        wb.click();  //it will unselect
	                    boolean issel1=wb.isSelected(); //it will check selected r nt
	                    System.out.println("clicked checkcbox succesfuly =="+issel1); //unselected so false
	                 //fluent wait will do timeout,polling then ignoring exception
	                    FluentWait wait=new FluentWait(driver);
	                   wait.withTimeout(5000,TimeUnit.MILLISECONDS);
	                   wait.pollingEvery(500, TimeUnit.MILLISECONDS);
	                   wait.ignoring(NoSuchElementException.class);
	                    boolean ena=driver.findElement(By.id("loginButton")).isEnabled();  //checks login button enabled r nt 
	                      System.out.println("login button enabled succesly=="+ena); {
							
						}               
	}

}
