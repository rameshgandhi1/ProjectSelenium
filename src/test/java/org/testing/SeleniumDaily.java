package org.testing;

import java.io.IOException;

import org.basic.BaseClass;
import org.basic.FBLoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDaily extends BaseClass {
	
	public static void main(String[] args) throws IOException  {
	launchChrome();
	
	loadUrl("https://www.facebook.com");
	
	winMax();
	printTitle();
	printCurrentUrl();
	
	
	
	WebElement txtUser = driver.findElement(By.id("email"));
	keyDown(txtUser);
	txtUser.sendKeys("greens");
	keyUp(txtUser);
	FBLoginPojo f=new FBLoginPojo();
	fill(f.getTxtUser(), getData(3, 0));
	doubleClick(txtUser);
	}
	
}