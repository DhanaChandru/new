package org.oranium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	System.out.println("Title of the web page - "+driver.getTitle());
	System.out.println("Amazon Homepage URL - "+driver.getCurrentUrl());
	driver.close();	
}
}
