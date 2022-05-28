package com.webdrvrmethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mulipleelemnhandles {

	public static void main(String[] args) {
		int no_of_links=300;
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver(); //upcasting
		                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("https://www.bbc.com/");
     List<WebElement> lst= driver.findElements(By.xpath("//a"));
	int linkcount=lst.size();
	System.out.println("link="+linkcount);
	if(no_of_links==linkcount)
	{System.out.println("link verified==pass");
	}
	else{
		System.out.println("link verified==fail");
	}
	for(int i=0;i<lst.size();i++)
		{
		String linktext=lst.get(i).getText();
		System.out.println(linktext);
		}
}}

