package org.pageCs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.units.Junitsframework;

public class JunitPC extends Junitsframework {
	
	public JunitPC() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='E-Mail Address']")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement ValidatemyAccount;
	public WebElement getValidatemyAccount() {
		return ValidatemyAccount;
	}
	
	@FindBy(xpath="(//a[text()='Address Book'])[1]")
	public WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement newAddress;
	public WebElement getNewAddress() {
		return newAddress;
	}
	
	@FindBy(xpath="//h2[text()='Add Address']")
	private WebElement addAddressValidate;
	public WebElement getAddAddressValidate() {
		return addAddressValidate;
	}
	
	
	
	
	
	
}
