package com.webdrvrmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webelmnt4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//implicit wait to page to load..
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
        Thread.sleep(5000);  //normal wait   
        //to get html tag of webelmnt
        String tagname=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getTagName(); //gettagname s use to get html tag
         System.out.println("tagname of fb logo=="+tagname);
         //to get location of webelmnt
         Point location=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getLocation();
        		 System.out.println("location:"+location);
        		 //gettcssvalue gives font,weight,color of any webelmnt
        		 String fntsize=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getCssValue("font-size");
	                   System.out.println("font of logo:"+fntsize);
	                   //getattribute it will take attr value.
	                   String attr=driver.findElement(By.name("email")).getAttribute("placeholder");
	                   System.out.println("attribute value_"+attr);
	                   WebElement wb=driver.findElement(By.name("email"));
	                   //explicit wait until it finds the element..once it finds it wont wait
	                   WebDriverWait wait=new WebDriverWait(driver, 20);
	          //         wait.until(ExpectedConditions.visibilityOf(wb)); //direct
	             	  
	                 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("email")));
	                   driver.close();
	}

}
