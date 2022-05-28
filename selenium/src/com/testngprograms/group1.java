package com.testngprograms;

import org.testng.annotations.Test;

public class group1 {
@Test(groups="Smoke")
public void Group1MethodTest1() {
	System.out.println("Group1method1 in testng1");
}
@Test(groups="Regression")
public void Group1MethodTest2() {
	System.out.println("Group1method2 in testng1");
}
@Test(groups="Smoke")
public void Group1MethodTest3() {
	System.out.println("Group1method3 in testng1");
}

}
