package org.execute;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pageCs.AddressPage;
import org.pageCs.JunitPC;
import org.units.Junitsframework;
import org.units.LinkedClass;

public class ExecuteScript01 extends Junitsframework {
	public static LinkedClass  jf=new LinkedClass();
	public static JunitPC test=new JunitPC();
	public static AddressPage ap=new AddressPage();
	
	@BeforeClass
	public static void TC01() {
		try {
			jf.browsertype("chrome");
			jf.lanchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			jf.winView("maximize");
			jf.scrollUpDown();	
			
			
		} catch (Exception e) {
			
		}
	}
	@Before
	public void TC02() {
		try {
			test=new JunitPC();
			WebElement email = test.getUserName();
			jf.userName(email, "aruljee1570@gmail.com");
			
			WebElement password = test.getPassword();
			jf.passWord(password, "Z18Y9Z");
			
			WebElement login = test.getLogin();
			jf.click(login);
			
			test.navigate("refresh");
			
			jf.scrollUpDown();
			WebElement validatemyAccount = test.getValidatemyAccount();
			test.validatePages(validatemyAccount, "My Account page validated");
			
			WebElement address = test.getAddress();
			jf.click(address);
			
			
			WebElement locate = test.getNewAddress();
			jf.click(locate);
			
			WebElement addAddressValidate = test.getAddAddressValidate();
			jf.validatePages(addAddressValidate, "Add Address Validation Successfull");
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void TC03() {
		try {
			ap=new AddressPage();
			WebElement firstname = ap.getFirstname();
			jf.textboxFill(firstname, "Arul");
			
			WebElement lastname = ap.getLastname();
			jf.textboxFill(lastname, "Kumar");
			jf.scrollUpDown();
			
			WebElement company = ap.getCompany();
			jf.textboxFill(company, "Sakthi Company");
			
			WebElement address1 = ap.getAddress1();
			jf.textboxFill(address1, "Namagiripettai,Rasipuram");
			
			WebElement address2 = ap.getAddress2();		
			jf.textboxFill(address2, "Perundurai,Erode");
			
			WebElement city = ap.getCity();
			jf.textboxFill(city, "Erode");
			
			WebElement postcode = ap.getPostcode();
			jf.textboxFill(postcode, "638001");
			
			
			WebElement country = ap.getCountry();
			jf.click(country);
			
			
			jf.sleep();
			WebElement state = ap.getState();
			jf.click(state);
			
			jf.keyboardAction();
			jf.sleep();
			jf.scrollUpDown();
			
	        WebElement continuebutton = ap.getContinuebutton();
			jf.click(continuebutton);
			jf.navigate("refresh");
			
		} catch (Exception e) {
			
		}
	}
	
	public void setss() {
		System.out.println("ok");

	}
	

}
