package com.testngprograms;

import org.testng.annotations.Test;

public class updateempdetails {
@Test(dependsOnMethods = "createEmployedata",groups="Smoke")
public void createEmployedata() {
	System.out.println("update emp data");
} 

}
