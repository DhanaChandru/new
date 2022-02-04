package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Print all the options in year using getAttirubute() method
		driver.get("https://www.facebook.com/");
		WebElement year = driver.findElement(By.id("year"));
		Select s = new Select(year);
		s.selectByValue("year");
		//String get = year.getAttribute("value");
		System.out.println("\nTask Completed");
}
}
