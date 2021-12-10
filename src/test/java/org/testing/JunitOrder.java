package org.testing;


import java.io.IOException;
import java.util.Date;

import org.basic.BaseClass;
import org.basic.FBLoginPojo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitOrder extends BaseClass {
	
	@BeforeClass
	public static void launchingBrowser() {
		launchChrome();
        winMax();
	}
	@AfterClass
	public static void closingBrowser() {
    closeChrome();
	}
	@Before
	public void startTime() {
	loadUrl("https://www.facebook.com/");
    Date d=new Date();
    System.out.println(d);
	}
	@After
	public void endTime() {
    System.out.println(new Date());
	}
	@Test
	public void test1() throws IOException, InterruptedException {
		String title = driver.getTitle();
	Assert.assertTrue("verify the title", title.contains("Facebook"));
	String currentUrl = driver.getCurrentUrl();
	Assert.assertEquals("https://www.facebook.com/", currentUrl);
	FBLoginPojo f=new FBLoginPojo();
	fill(f.getTxtUser(), getData(1, 0));
	fill(f.getTxtPass(), getData(1, 1));
	btnClick(f.getBtnLogin());
	Thread.sleep(2000);
	}
	@Test
	public void test3() throws IOException, InterruptedException {
    FBLoginPojo f=new FBLoginPojo();
    fill(f.getTxtUser(), getData(2, 0));
    fill(f.getTxtUser(), getData(2, 1));
    btnClick(f.getBtnLogin());
    Thread.sleep(2000);
	}

	@Test 
	public void test2() throws IOException, InterruptedException {
	FBLoginPojo f=new FBLoginPojo();
	fill(f.getTxtPass(), getData(3, 0));
	fill(f.getTxtPass(), getData(3, 1));
	btnClick(f.getBtnLogin());
	Thread.sleep(2000);
	}
	
	
	
	
	
}
