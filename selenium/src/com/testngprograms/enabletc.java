package com.testngprograms;

import org.testng.annotations.Test;
//if v dont want exe sum tc then enable it like false..means disebling
public class enabletc {
	@Test(enabled = false)   //it will not exe
	public void Testmethod1() {
		System.out.println("Testscenerio1");
}
	@Test
	public void Testmethod2() {
		System.out.println("Testscenerio2");
}
	@Test
	public void Testmethod3() {
		System.out.println("Testscenerio3");
}
	@Test(enabled = false)      //it wil nt run
	public void Testmethod4() {
		System.out.println("Testscenerio4");
}
}
