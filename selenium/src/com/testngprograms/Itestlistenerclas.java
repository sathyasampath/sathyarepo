package com.testngprograms;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//listener is a interface ..listens the event n helps to perform any actions on the event during exe/change the behaviour of the testng
//it has implemented methods default..before java 7 only v have to add unimplentd methods..but nt nw
//listeners are Itestlistener,iannoatationtranformer n 2,ihookable,iinvokedmethodslistne,
//imethodinterceptor,ireporter,isuitelistnr




@Listeners(itestlistenerclas1.class)
public class Itestlistenerclas {


	@Test
	public void tm1() { //this are methods already implemnted in itrstlistnr
		System.out.println("m1");
	}

	@Test
	public void tm2() {//for evry event v hav methods in listener
		System.out.println("m2");
		Assert.assertTrue(false);
		}

	@Test
	public void tm3() {
		System.out.println("m3");
		
	}
	@Test
	public void tm4() {
		System.out.println("m4");}

	@Test(timeOut=1000) 
	public void tm5() throws Exception {
		Thread.sleep(2000);
		System.out.println("m5");
	}

	@Test(dependsOnMethods = "tm5")
	public void tm6() {
		System.out.println("m6");
	}

	 
}
