package org.pageCs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.units.Junitsframework;

public class AddressPage extends Junitsframework {

	public AddressPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(name="lastname")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(name="company")
	private WebElement company;
	public WebElement getCompany() {
		return company;
	}
	
    @FindBy(name="address_1")
	private WebElement address1;
    public WebElement getAddress1() {
		return address1;
	}
	@FindBy(name="address_2")
    private WebElement address2;
	public WebElement getAddress2() {
		return address2;
	}

	
	@FindBy(name="city")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	
	@FindBy(name="postcode")
	private WebElement postcode;
	public WebElement getPostcode() {
		return postcode;
	}
//	
//	@FindBy(name="country_id")
//	private WebElement countryId;
//	public WebElement getCountryId() {
//		return countryId;
//	}
	
	
	@FindBy(xpath="//option[text()='India']")
	private WebElement country;
	public WebElement getCountry() {
		return country;
	}
	
	
	
	@FindBy(name="zone_id")
	private WebElement state;
	public WebElement getState() {
		return state;
	}
	
	@FindBy(xpath="//option[text()='Tamil Nadu']")
	private WebElement selectstate;
	public WebElement getSelectstate() {
		return selectstate;
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continuebutton;
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
