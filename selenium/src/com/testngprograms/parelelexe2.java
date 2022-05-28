package com.testngprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parelelexe2 {
	@Test
	public void parel1() {
		int no_of_links=300;
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
				
				WebDriver driver=new ChromeDriver(); //upcasting
				                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
		     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    driver.get("https://www.bbc.com/");
		     List<WebElement> lst= driver.findElements(By.xpath("//a"));
			int linkcount=lst.size();
			System.out.println("link="+linkcount);
	}
}
