package com.testngprograms;

import org.testng.annotations.Test;
//invocationcount will exe same testcase multiple times
public class invocationcnt {
	@Test(invocationCount = 10)  //here it passes 10 times
	public void Testmethod1Test() {
		System.out.println("invocationcnt");
}

}
