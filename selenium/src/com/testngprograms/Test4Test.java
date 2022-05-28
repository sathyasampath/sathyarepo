package com.testngprograms;

import org.testng.annotations.Test;

public class Test4Test {
	@Test(groups={"Smoke","Regression"})  //one testcase can hav multiple groups
	public void Testmethod2Test() {
		System.out.println("Testscenerio2");
}
}
