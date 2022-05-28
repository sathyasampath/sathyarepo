package com.testngprograms;

import org.testng.annotations.Test;
//dependsonmeethod
public class createEmploye {
@Test
public void VcreateEmployedata() {
	System.out.println("enter emp data");
} 
@Test(dependsOnMethods = "VcreateEmployedata") //this mentnd method will exe first
public void UpdateEmployedata() {
	System.out.println("update emp data");
} 

}
