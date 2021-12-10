package org.testing;

import org.testng.annotations.Test;

public class Sample1 {
	@Test
	private void tc11() {
		System.out.println("test11  "+Thread.currentThread().getId());
	}
	@Test
	private void tc22() {
		System.out.println("test22  "+Thread.currentThread().getId());
	}
	@Test
	private void tc33() {
    System.out.println("test33  "+Thread.currentThread().getId());
	}
	

}
