package com.testngprograms;

import org.testng.annotations.Test;
//v can prioritize the method exe as v want becoz default is alpha order
public class PriorityTestCase {
	@Test(priority = 3)
	public void Group1MethodTest1() {
		System.out.println("Group1method1 in testng1");
	}
	@Test(priority = 1)
	public void Group1MethodTest2() {
		System.out.println("Group1method2 in testng1");
	}
	@Test(priority = 2)
	public void Group1MethodTest3() {
		System.out.println("Group1method3 in testng1");
	}
}
 