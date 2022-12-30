package org.amazonspecial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonSpecialTask extends BaseClass{
	
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
		System.out.println("------Product Name------");
		List<WebElement> product = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<String> l=new ArrayList<String>();
		for(WebElement x:product) {
			String text = x.getText();
			System.out.println(text);
			l.add(text);
		}
		System.out.println("------Mobile Price--------");
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> l1=new LinkedList<Integer>();
		for (WebElement x : price) {
		
			String text = x.getText();
			text = text.replace(",", "");
			System.out.println(text);
					
			int p = Integer.parseInt(text);
			l1.add(p);
			
		}
		
		System.out.println("--------Price === Phone----------");
		Map<Integer, String> m=new LinkedHashMap<Integer, String>();
		for (int i = 0; i < l.size(); i++) {
		
			System.out.println(l1.get(i)+"=="+l.get(i));
			
		}
		System.out.println(m);
		
		System.out.println("=======Assending Order=======");
		Collections.sort(l1);
		System.out.println(l);
		System.out.println("========Desending Order==========");
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println(l1);
		System.out.println("=====Maximum And Minimum=======");
		System.out.println(Collections.max(l1));
		System.out.println(Collections.min(l1));
		
		int size=l1.size();
		System.out.println(size);
		int size2=l.size();
		System.out.println(size2);
		
//		System.out.println("--------Price === Phone----------");
//		Map<Integer, String> m=new LinkedHashMap<Integer, String>();
//		for (int i = 0; i < l.size(); i++) {
//		
//			System.out.println(l1.get(i)+"=="+l.get(i));
//			
//		}
//		System.out.println(m);
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
}
