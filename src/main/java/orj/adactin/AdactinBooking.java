package orj.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTagName;

public class AdactinBooking extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver=chromeDriver();
		
		urlLaunch("http://adactinhotelapp.com/index.php");
		
		ImplicitlyWait(60);
		
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = getTitle();
		System.out.println(title);
		
		WebElement findElement = driver.findElement(By.id("username"));
		SendKeys(findElement, "12345sam");
		String attribute = getAttribute(findElement);
		System.out.println(attribute);
		
		WebElement findElement2 = driver.findElement(By.id("password"));
		SendKeys(findElement2, "sankar12345");
		String attribute2 = getAttribute(findElement2);
		System.out.println(attribute2);
		
		WebElement findElement3 = driver.findElement(By.id("login"));
		click(findElement3);
		
		WebElement findElement4 = driver.findElement(By.id("location"));
		selectedByIndex(findElement4, 2);
		String attribute3 = getAttribute(findElement4);
		System.out.println(attribute3);
		
		WebElement findElement5 = driver.findElement(By.id("hotels"));
		selectedByIndex(findElement5, 1);
		String attribute4 = getAttribute(findElement5);
		System.out.println(attribute4);
		
		WebElement findElement6 = driver.findElement(By.id("room_type"));
		selectedByIndex(findElement6, 1);
		String attribute5 = getAttribute(findElement6);
		System.out.println(attribute5);
		
		WebElement findElement7 = driver.findElement(By.id("room_nos"));
		selectedByIndex(findElement7, 4);
		String attribute6 = getAttribute(findElement7);
		System.out.println(attribute6);
		
		WebElement findElement8 = driver.findElement(By.id("datepick_in"));
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);	
		r.keyRelease(KeyEvent.VK_CONTROL);
		senKeys(findElement8, "01/01/2023");
		String attribute7 = getAttribute(findElement8);
		System.out.println(attribute7);
		
		
//		WebElement findElement9 = driver.findElement(By.id("datepick_out"));
//		contextClick(findElement9);
//		click(findElement9);
//		SendKeys(findElement9, "03/01/2023");
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
