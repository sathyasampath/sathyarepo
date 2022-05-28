package com.testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//assert i a class..use to verify the expected result in testcases..it has static methods
//assert is for expected result validation.
//will get testng report with error n exception ...we will show it to dev to fix the prblm
//asssert will show assertioneeror for fail like error n exception..for pass it will show pass
//hardassert
//softaasert
public class verifydata {
	@Test
	public void verifymethod() {
		String Expectedtext="Facebook helps you connect and share with the people in your life";
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver(); //upcasting
	                                     //launching browser v need to use webdriver interface methods...so v do upcasting here
   driver.get("https://www.facebook.com/");
   String Actualtext= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]")).getText();
	/*
	 * if(Actualtext.equals(Expectedtext)) {
	 * System.out.println("text are matching==pass"); }else {
	 * System.out.println("text not matching==fail"); }
	 */
   //hardassert class...Assert its a hardassert
//Assert.assertEquals(Expectedtext, Actualtext," results doesnt matched");//if this line fails terminates exe here..not gng fa nxt line.. so v go for softaasert class
//softassert class
SoftAssert as=new SoftAssert();  //now exe will not terminates bcoz v used softassert
as.assertEquals(Expectedtext,Actualtext,"result doesnt matched");
as.assertTrue(false);
as.assertTrue(true);
as.assertEquals(11, 21, "num doesnt matched");
as.assertAll();                 //it will get all assert..its mandatory
System.out.println("testcase ended");
	
	
	}
}