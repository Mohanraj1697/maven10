package org.login;

import org.base.BaseClass;

public class SampleLogin extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("chrome");
		
		urlLaunch("https://www.facebook.com/");
		
		ImplicitlyWait(60);
		
		
		LoginPage l=new LoginPage();
		
		senKeys(l.getTxtusername(), "9445518956");
		String attribute = getAttribute(l.getTxtusername());
		System.out.println(attribute);
		
		Thread.sleep(5000);
		
		SendKeys(l.getTxtpassword(), "143raj");
		String attribute2 = getAttribute(l.getTxtpassword());
		System.out.println(attribute2);
		
		click(l.getBtnlogin());
		
		
		
//		try {
//			sendKeys(l.getTxtusername(), "mohan");
//		} catch (Exception e) {
//			System.out.println("Exception is "+e.getMessage());
//		}
		
		
		
	
		
		
		
		
		
		
		
	}
	
	
}
