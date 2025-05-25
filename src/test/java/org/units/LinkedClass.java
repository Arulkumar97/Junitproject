package org.units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pageCs.AddressBook;
import org.pageCs.AddressPage;

import org.pageCs.JunitPC;
import org.pageCs.MyAccountPage;

public class LinkedClass extends Junitsframework {
	public static void main(String[] args) {
		LinkedClass jf=new LinkedClass();
	    jf.browsertype("chrome");
		jf.lanchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		jf.winView("maximize");
		jf.scrollUpDown();
		
		
		JunitPC test=new JunitPC();
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
		
		AddressPage ap=new AddressPage();
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
		
		AddressBook ab=new AddressBook();
		WebElement validateAddressbook = ab.getValidateAddressbook();
		jf.validatePages(validateAddressbook, "Address Book Entires page validated");
		
		WebElement edit = ab.getEdit();
		jf.click(edit);
		jf.scrollUpDown();
		jf.navigate("refresh");
		
		WebElement editPageValidate = ab.getEditPageValidate();
		jf.validatePages(editPageValidate, "Now Edit page is present");
		jf.scrollUpDown();
		
		WebElement continues = ab.getContinues();
		jf.click(continues);
		jf.sleep();
		
		WebElement myAccount = ab.getMyAccount();
		jf.click(myAccount);
		
		MyAccountPage mp=new MyAccountPage();
		WebElement myAccountsValidaation2 = mp.getMyAccountsValidaation2();
		jf.validatePages(myAccountsValidaation2, "My Account page validation successfull");
		
		WebElement desktop = mp.getDesktop();
		jf.click(desktop);
		
		WebElement showAll = mp.getShowAll();
		jf.click(showAll);
		jf.scrollUpDown();
		
		WebElement selectAtoZ = mp.getSelectAtoZ();
		jf.click(selectAtoZ);
		
		WebElement names = mp.getNames();
		jf.click(names);
		
		WebElement sort = mp.getSort();
		jf.click(sort);
		
		WebElement sortInput = mp.getSortInput();
		jf.click(sortInput);
		jf.scrollUpDown();
		
		WebElement product = mp.getProduct();
		jf.click(product);
		//jf.scrollMthods("Down");
		jf.scrollUpDown();
		
		WebElement addToCartValidate = mp.getAddToCartValidate();
		jf.validatePages(addToCartValidate, "Add to cart button activated");
		
		WebElement addToCartClick = mp.getAddToCartValidate();
		jf.click(addToCartClick);
		
		WebElement clickCart = mp.getClickCart();
		jf.click(clickCart);
		jf.sleep();
		jf.cartViewAction();
		jf.navigate("refresh");
		
		WebElement shoppingCartvalidate = mp.getShoppingCart();
	    jf.validatePages(shoppingCartvalidate, "Shopping cart validated Successful");
	    jf.scrollMthods("Down");
	    
	    WebElement checkout = mp.getCheckout();
	    jf.click(checkout);
	    jf.scrollMthods("Up");
	    jf.sleep();
	    WebElement myAccountclick = mp.getMyAccountclick();
	    jf.click(myAccountclick);
	    
	    WebElement logout = mp.getLogout();
	    jf.click(logout);
	    
	    WebElement validateLogout = mp.getValidateLogout();
	    jf.validatePages(validateLogout, "LogOut Successfull");
	    
	    
	    
	}

}
