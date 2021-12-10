package org.testing;

import java.io.IOException;

import org.basic.BaseClass;
import org.basic.FBLoginPojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample extends BaseClass {
	@Test
	private void tc1() {
		long id = Thread.currentThread().getId();
		
		System.out.println("test1  "+id);
	}
	@Test
	private void tc2() {
		System.out.println("Test2  "+Thread.currentThread().getId());
	}
	@Test
	private void tc3() {
    System.out.println("test3  "+Thread.currentThread().getId());
	}
	

}
