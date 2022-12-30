package org.test;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample12 extends BaseClass{
	
public static void main(String[] args) {
		
		WebDriver driver=chromeDriver();
		
		
		urlLaunch("https://www.facebook.com/");
		
		ImplicitlyWait(60);
		
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = getTitle();
		System.out.println(title);
		
		
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
//		sendKeys(id,"9445518956");
		
		SendKeys(id, "mboghn");
		
		WebElement pass = driver.findElement(By.id("pass"));
		senKeys(pass, "143raj");
		
		refersh();
		
		WebElement id1 = driver.findElement(By.xpath("//input[@id='email']"));
		senKeys(id1,"944551");
		
		WebElement pass1 = driver.findElement(By.id("pass"));
		senKeys(pass1, "143raj");
		
		
		
		
		
	}
}
