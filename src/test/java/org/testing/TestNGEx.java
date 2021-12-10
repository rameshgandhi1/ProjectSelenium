package org.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.Date;

import org.basic.BaseClass;
import org.basic.FBLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGEx extends BaseClass{
	@BeforeClass
	private void browserLaunching() {
    launchChrome();
    winMax();
    
	}
	@AfterClass
	private void closingBrowser() {
    closeChrome();
	}
	@BeforeMethod
	private void startTime() {
    System.out.println(new Date());
    loadUrl("https://www.facebook.com/");
	}
	@AfterMethod
	private void endTime() {
    System.out.println(new Date());
    
	}

	@Parameters({"Input","Output"})
	@Test
	private void tc2(String s1,String s2) throws IOException, InterruptedException {
    FBLoginPojo f=new FBLoginPojo();
    fill(f.getTxtUser(), s1);
    fill(f.getTxtPass(), s2);
    btnClick(f.getBtnLogin());
    Thread.sleep(2000); 
	}
   
 
	}
	
   

