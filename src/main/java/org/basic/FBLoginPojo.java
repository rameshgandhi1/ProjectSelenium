package org.basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPojo extends BaseClass {
	public FBLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBys ({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@type='text']")
	})
	private WebElement txtUser;
	
	@FindBy (id="pass")
    private WebElement txtPass;
	
	@FindAll({
		@FindBy(id="pas"),
		@FindBy(xpath="//button[@name='login']")
	})
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	

}   
 