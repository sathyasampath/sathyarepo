package com.testngprograms;

import org.testng.annotations.Test;

public class group2 {
	@Test(groups="Regression")
	public void Group2MethodTest1() {
		System.out.println("Group2method1 in testng2");
	}
	@Test(groups="Smoke")
	public void Group2MethodTest2() {
		System.out.println("Group2method2 in testng2");
	}
	@Test(groups="Regression")
	public void Group3MethodTest3() {
		System.out.println("Group2method3 in testng2");
	}

}
