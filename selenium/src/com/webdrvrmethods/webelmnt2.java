package com.webdrvrmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelmnt2 {

	public static void main(String[] args) throws InterruptedException {
		String value="Facebook helps you connect and share with the people in your life.";
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(5000);
	   Boolean logodis=driver.findElement(By.xpath("//div[img[@class='fb_logo _8ilh img']]")).isDisplayed(); //isdisplay use to check img is displayed ther r nt
	   System.out.println("facebook logo is displayed =="+logodis);
	   String text=driver.findElement(By.xpath("//div[img[@class='fb_logo _8ilh img']]/following-sibling::h2")).getText();//gettext used to get visible text frm webpge
	if(value.equals(text)) {
		System.out.println("text is matched succesfully==pass");
	}
	}

}
