package orj.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;

public class AdactinSample extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		launchBrowser("chrome");
		
		urlLaunch("http://adactinhotelapp.com/index.php");
		
		ImplicitlyWait(60);
		AdactinHotel a=new AdactinHotel();
		
//		SendKeys(a.getTxtusername(), "12345sam");
//		senKeys(a.getTxtpass(), "sankar12345");
//		senKeys(a.getTxtusername(), "12345sam");
		//correctly passed keys
		
		SendKeys(a.getTxtusername(), "12345sam");
		SendKeys(a.getTxtpass(), "sankar12345");
		click(a.getBtnlogin());
		selectedByIndex(a.getLocation(), 1);
		selectedByIndex(a.getHotel(), 2);
		selectedByIndex(a.getRoomNo(), 1);
		selectedByIndex(a.getRoomType(), 2);
		Thread.sleep(3000);
		click(a.getCheckIn());
		for (int i = 0; i < 10; i++) {
			keyBackspace(a.getCheckIn());
		}
		SendKeys(a.getCheckIn(), "01.01.2023");
		Thread.sleep(3000);
		click(a.getCheckOut());
		for (int i = 0; i < 10; i++) {
			keyBackspace(a.getCheckOut());
		}
		SendKeys(a.getCheckOut(), "03.01.2023");
		selectedByIndex(a.getAudltRoom(), 2);
		selectedByIndex(a.getChildRoom(), 2);
		click(a.getBtnsearch1());
		click(a.getBtnDropBox());
		click(a.getBtnContinue());
		SendKeys(a.getFirstName(), "Mohan");
		SendKeys(a.getLastName(), "Venkat");
		SendKeys(a.getAddress(), "SettiPatti(vill),Dharmapuri(dt)");
		SendKeys(a.getAccNo(), "1234567891234562");
		selectedByIndex(a.getCardType(), 1);
		selectedByIndex(a.getExpireMonth(), 5);
		selectedByIndex(a.getExpireYear(), 6);
		SendKeys(a.getCvv(), "431");
		click(a.getBtnBook());
		
	}
	
}
