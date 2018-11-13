package com.abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","/Users/kaan/Desktop/selenium dependencies/drivers/chromedriver");
		
	WebDriver driver=new ChromeDriver();
		
	driver.get("http://amazon.com");
	
	//System.setProperty("webdriver.gecko.driver","/Users/kaan/Desktop/selenium dependencies/drivers/geckodriver");
	
	//WebDriver driver=new FirefoxDriver();
	
	//driver.get("http://cybertekschool.com");
}
}
