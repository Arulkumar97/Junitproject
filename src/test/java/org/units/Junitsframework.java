package org.units;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Junitsframework {
	public static WebDriver driver;
	JavascriptExecutor js;
	Actions s;
	Select g;
	Robot t;
	public void browsertype(String type) {
		switch (type) {
		case "chrome":
			driver=new ChromeDriver();
		break;
		case "edge":
			driver=new EdgeDriver();
        break;
		default:
			break;
		}
	}
	public void lanchUrl(String url) {
		driver.get(url);
	}
	
	public void winView(String view) {
		switch (view) {
		case "maximize":
			driver.manage().window().maximize();
		break;
		case "minimize":
			driver.manage().window().minimize();
        break;
		default:
			break;
		}
		
	}
	public void validatePages(WebElement element,String text) {
		element.isDisplayed();
		System.out.println(text);
		
	}
	
	public void userName(WebElement element,String name) {
		
			element.sendKeys(name);
	
	}
	
	public void passWord(WebElement element,String name) {
		element.sendKeys(name);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void navigate(String option) {
		
		switch (option) {
		case "forword":
			driver.navigate().forward();
			break;
		case "back":
			driver.navigate().back();
			break;
		case "refresh":
			driver.navigate().refresh();
			
			break;
		default:
			break;
		}
	}
	
	public void sleep() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		

	}
	public void actions(WebElement element) {
		s=new Actions(driver);
		s.moveToElement(element).click();

	}
	public void textboxFill(WebElement element,String txt) {
		element.sendKeys(txt);
		
	}
	
	public void scrollUpDown() {
		js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");

	}
	
	public void keyboardAction() {
		try {
			t=new Robot();
			t.keyPress(KeyEvent.VK_DOWN);
			t.keyRelease(KeyEvent.VK_DOWN);	
			t.keyPress(KeyEvent.VK_DOWN);
			t.keyRelease(KeyEvent.VK_DOWN);	
			t.keyPress(KeyEvent.VK_DOWN);
			t.keyRelease(KeyEvent.VK_DOWN);
			t.keyPress(KeyEvent.VK_DOWN);
			t.keyRelease(KeyEvent.VK_DOWN);
			t.keyPress(KeyEvent.VK_ENTER);
			t.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			
		}
			

	}
	
	public void scrollMthods(String type) {
		
		switch (type) {
		case "Up":
			js=(JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,-400)");
			
		case "Down":
			js=(JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,600)");
			break;

		default:
			break;
		}
	}
		public void cartViewAction() {
			try {
				t=new Robot();
				t.keyPress(KeyEvent.VK_DOWN);
				t.keyRelease(KeyEvent.VK_DOWN);	
				t.keyPress(KeyEvent.VK_DOWN);
				t.keyRelease(KeyEvent.VK_DOWN);	
				t.keyPress(KeyEvent.VK_DOWN);
				t.keyRelease(KeyEvent.VK_DOWN);	
				t.keyPress(KeyEvent.VK_ENTER);
				t.keyRelease(KeyEvent.VK_ENTER);
			} catch (Exception e) {
				
			}

		}
	
	
	
		
		
		
	
	
	
	
	

}
