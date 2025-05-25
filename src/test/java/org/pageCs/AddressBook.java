package org.pageCs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.units.Junitsframework;

public class AddressBook extends Junitsframework {
	public AddressBook() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[text()='Address Book Entries']")
	private WebElement validateAddressbook;
	public WebElement getValidateAddressbook() {
		return validateAddressbook;
	}
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	private WebElement edit;
	public WebElement getEdit() {
		return edit;
	}
	@FindBy(xpath="//h2[text()='Edit Address']")
	private WebElement editPageValidate;
	public WebElement getEditPageValidate() {
		return editPageValidate;
	}
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continues;
	public WebElement getContinues() {
		return continues;
	}
	
	@FindBy(xpath="//a[text()='Account']")
	private WebElement myAccount;
	public WebElement getMyAccount() {
		return myAccount;
	}
	
	
	private WebElement add;
	public WebElement getAdd() {
		return add;
	}
	
}
