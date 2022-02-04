package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//Go to Amazon - Search IPHONE12 - Find No. of Products and Print those product Names & Prices
	driver.get("https://www.amazon.com");
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("iphone12");
	Thread.sleep(500);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	List<WebElement> list2= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	int size = list.size();
	System.out.println("Product Size: "+size);
	int size2 = list2.size();
	System.out.println("Price Size: "+size2);
	for (int i = 1; i < list.size(); i++) {
				for (int j = 0; j < list2.size(); j++) {
				String text1= list.get(i).getText();
				String text2 = list2.get(j).getText();
				System.out.println("Product Name: "+text1+"\nPrice: $"+text2+"\n=============");
				i++;
	}			
	}	
}
}
