package org.pageCs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.units.Junitsframework;

public class MyAccountPage extends Junitsframework {
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement myAccountsValidaation2;
	public WebElement getMyAccountsValidaation2() {
		return myAccountsValidaation2;
	}
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktop;
	public WebElement getDesktop() {
		return desktop;
	}
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showAll;
	public WebElement getShowAll() {
		return showAll;
	}
	@FindBy(xpath="(//select[@class='form-control'])[1]")
	private WebElement selectAtoZ;
	public WebElement getSelectAtoZ() {
		return selectAtoZ;
	}
	
	@FindBy(xpath="//option[text()='Name (A - Z)']")
	private WebElement names;
	public WebElement getNames() {
		return names;
	}
	
	@FindBy(xpath="(//select[@class='form-control'])[2]")
	private WebElement sort;
	public WebElement getSort() {
		return sort;
	}
	
	@FindBy(xpath="//option[text()='25']")
	private WebElement sortInput;
	public WebElement getSortInput() {
		return sortInput;
	}
	
	@FindBy(xpath="(//a[text()='HP LP3065'])[2]")
	private WebElement product;
	public WebElement getProduct() {
		return product;
	}
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement addToCartValidate;
	public WebElement getAddToCartValidate() {
		return addToCartValidate;
	}
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement clickCart;
	public WebElement getClickCart() {
		return clickCart;
	}
	@FindBy(xpath="//a[text()='Shopping Cart']")
	private WebElement shoppingCart;
	public WebElement getShoppingCart() {
		return shoppingCart;
	}
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkout;
	public WebElement getCheckout() {
		return checkout;
	}
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myAccountclick;
	public WebElement getMyAccountclick() {
		return myAccountclick;
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement validateLogout;
	public WebElement getValidateLogout() {
		return validateLogout;
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

