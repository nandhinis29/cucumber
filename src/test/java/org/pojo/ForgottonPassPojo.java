package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottonPassPojo extends BaseClass {

	//default constructer
	public ForgottonPassPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Forgotten password']")
	private WebElement btnFrgtPass;
	
	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
	private WebElement txtSearchBox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btnSearch;

	public WebElement getBtnFrgtPass() {
		return btnFrgtPass;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
}
