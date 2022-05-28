package com.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		//pass control to alert and capture text present in alert 
		Alert alt=driver.switchTo().alert();
		String alerttext=alt.getText();
		System.out.println(alerttext);
		alt.accept();      //it will click OK button on alert
        //alt.dismiss(); //for cancel button
		driver.findElement(By.id("promtBox")).click();
		Alert alt1=driver.switchTo().alert();
		alt1.sendKeys("lokeshwar018eee@gmail.com");
		alt1.dismiss();
	}

}
