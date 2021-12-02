package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BussinessLib {
	
	public WebDriver driver;

		public static By parseObject(String p_object) {
			String newObject = null;

			if (p_object.startsWith(".//") || p_object.startsWith("//")) { //兼容selenium ide xpath的识别
				return By.xpath(p_object);
			} else if (p_object.startsWith("link=") || p_object.startsWith("Link=")) {
				newObject = p_object.substring(p_object.indexOf("=") + 1); //截取=后面所有的字符串
				return By.linkText(newObject);
			} else if (p_object.startsWith("xpath=")) {
				newObject = p_object.substring(p_object.indexOf("=") + 1);
				return By.xpath(newObject);
			} else if (p_object.startsWith("id=")) {
				newObject = p_object.substring(p_object.indexOf("=") + 1);
				return By.id(newObject);
			} else if (p_object.startsWith("css=")) {
				newObject = p_object.substring(p_object.indexOf("=") + 1);
				return By.cssSelector(newObject);
			} else if (p_object.startsWith("class=")) {
				newObject = p_object.substring(p_object.indexOf("=") + 1);
				return By.className(newObject);
			} else if (p_object.startsWith("tagName=")) {
				newObject = p_object.substring(p_object.indexOf("=") + 1);
				return By.tagName(newObject);
			} else if (p_object.startsWith("name=")) {
				newObject = p_object.substring(p_object.indexOf("=") + 1);
				return By.name(newObject);
			} else
				return null;

		}
		
		public void getBrowser() {
			
		}
		
		public void login(WebDriver webdriver,String username,String pwd) {
			driver=webdriver;
			driver.findElement(parseObject(ElementStore.LOGIN_USERNAME)).click();
			driver.findElement(parseObject(ElementStore.LOGIN_USERNAME)).clear();
			driver.findElement(parseObject(ElementStore.LOGIN_USERNAME)).sendKeys(username);
			driver.findElement(parseObject(ElementStore.LOGIN_PWD)).click();
			driver.findElement(parseObject(ElementStore.LOGIN_PWD)).clear();
			driver.findElement(parseObject(ElementStore.LOGIN_PWD)).sendKeys(pwd);
			driver.findElement(parseObject(ElementStore.LOGIN_BTN)).click();
			
			
			
		}

}
