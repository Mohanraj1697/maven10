package org.amazonspecial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AmazonNew extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
launchBrowser("chrome");
		
		urlLaunch("https://www.amazon.in/");
		
		ImplicitlyWait(60);
		
		Thread.sleep(5000);
		WebElement txtsearch = driver.findElement(By.xpath("(//div[@class='nav-fill'])[2]"));
		click(txtsearch);
		
		senKeys(txtsearch, "redmi note 11");
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		click(search);
		System.out.println("------Product Name------\n");
		List<WebElement> product = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<String> l=new ArrayList<String>();
		for(WebElement x:product) {
			String text = x.getText();
			System.out.println(text);
			l.add(text);
		}
		System.out.println("------Mobile Price--------\n");
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> l1=new LinkedList<Integer>();
		for (WebElement x : price) {
		
			String text = x.getText();
			text = text.replace(",", "");
			System.out.println(text);
					
			int p = Integer.parseInt(text);
			l1.add(p);
			
		}
		
		System.out.println("--------Price === Phone----------\n");
		
		for (int i = 0; i < l.size(); i++) {
		
			System.out.println(l1.get(i)+"=="+l.get(i));
			
		}
		
		WebElement click2 = driver.findElement(By.xpath("//a[@aria-label='Go to page 2']"));
		click(click2);
		
		System.out.println("=====2nd PAGE======\n");
		System.out.println("------Product Name ------\n");
		
		Thread.sleep(3000);
		List<WebElement> product1= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		

		List<String> l2=new ArrayList<String>();
		
		for(WebElement x:product1) {
			String text = x.getText();
			System.out.println(text);
			l2.add(text);
		}
		
		System.out.println("------Mobile Price--------\n");
		List<WebElement> price1 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> l3=new LinkedList<Integer>();
		Thread.sleep(4000);
		for (WebElement x : price1) {
		
			Thread.sleep(3000);
			String text = x.getText();
			text = text.replace(",", "");
			System.out.println(text);
					
			int p = Integer.parseInt(text);
			l3.add(p);
			
		}
		
		System.out.println("--------Price === Phone----------\n");
		Thread.sleep(6000);
		
		for (int i = 0; i < l2.size(); i++) {
			Thread.sleep(6000);
			System.out.println(l3.get(i)+"=="+l2.get(i));
			
		}
		Thread.sleep(3000);
		
		
		WebElement click3 = driver.findElement(By.xpath("//a[@aria-label='Go to page 3']"));
		click(click3);
		
		System.out.println("=====3nd PAGE======\n");
		
		System.out.println("------Product Name ------\n");
		
		Thread.sleep(3000);
		List<WebElement> product2= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		

		List<String> l4=new ArrayList<String>();
		
		for(WebElement x:product2) {
			String text = x.getText();
			System.out.println(text);
			l4.add(text);
		}
		
		System.out.println("------Mobile Price--------\n");
		List<WebElement> price2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> l5=new LinkedList<Integer>();
		Thread.sleep(4000);
		for (WebElement x : price2) {
		
			Thread.sleep(3000);
			String text = x.getText();
			text = text.replace(",", "");
			System.out.println(text);
					
			int p = Integer.parseInt(text);
			l5.add(p);
			
		}
		
		System.out.println("--------Price === Phone----------\n");
		
		
		for (int i = 0; i < l5.size(); i++) {
			Thread.sleep(6000);
			System.out.println(l5.get(i)+"=="+l4.get(i));
			
		}
		
		
		
		
		
		
	}
		
		
		
	}
	
	
	

