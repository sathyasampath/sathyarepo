package com.testngprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//testng compiler starts exe in alpha manner in methods
//testng have @befor n @after methods annot to maintain independendecy..so tat if one testcase fail remaining vl not fail
//@Test is like main mthod..
//three reports genertd during exe ..ie..1.eclipse console ..2.testng console..3.html report
//all methods in testng should hav suffix like test except @after n @befor methods
//@Beforeclass --if v use it ..v don need to open the browser often..one time usage is applicab for whole class..same @afterclass

public class Test2Test {
	@BeforeClass                        //can initialize any var too..it can b acceded from entire clas
	public void bfrclass() {
		System.out.println("open browser");
	}
	@BeforeMethod
	public void bfrmthd() {
		//System.out.println("open browser"); //no need if v use beforeclas
		System.out.println("login in to app");
		}

	@Test
	public void BTestmethod1Test() {
		System.out.println("Testcase1");
	}
		@Test
		public void ATestmethod2Test() {
			System.out.println("Testcase2");

}
		@AfterMethod
		public void aftrmthd() {
			System.out.println("logout");
			//System.out.println("close the browser"); //no need if use afterclas
			}
		@AfterClass
		public void aftrclass() {
			System.out.println("close browser");
		}	 
}