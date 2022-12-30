package org.base;

import java.awt.AWTException;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static WebDriver chromeDriver() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		return driver;
		
	}

	public static WebDriver launchBrowser(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edgebrowser")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		return driver;
	}
	
	
	public static void urlLaunch(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public static void ImplicitlyWait(int a) {
		
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
	
	public static void SendKeys(WebElement e,String b) {
		
		e.sendKeys(b);
		
	}
	
	public static void click(WebElement e) {
		
		e.click();
		
	}
	
	public static void refersh() {
		
		driver.navigate().refresh();
		
	}
	
	public static void to(String a) {
		
		driver.navigate().to(a);
		
	}
	
	public static void forward(String a) {
		
		driver.navigate().forward();
		
	}
	
	public static String getCurrentUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	
	public static String getTitle() {
		
		String title = driver.getTitle();
		return title;
		
	}
	
	public static void quit() {
		
		driver.quit();
		
	}
	
	public static void clear(WebElement e) {
		
		e.clear();
		
	}
	
	public static String getText(WebElement e) {
		
		String text = e.getText();
		return text;
		
	}
	
	public static String getAttribute(WebElement e) {
		
		String attribute = e.getAttribute("value");
		return attribute;
		
	}
	
	public static String getAttributeInnertext(WebElement e,String a) {
		
		String attribute = e.getAttribute("a");
		return attribute;
		
	}
	
	public static void moveToElement(WebElement e) {
		
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		
	}
	
	public static void dragAndDown(WebElement src,WebElement tar) {
		
		Actions a=new Actions(driver);
		a.dragAndDrop(src, tar).perform();
		
	}
	
	public static void senKeys(WebElement b,String e) {
		
		Actions a=new Actions(driver);
		a.sendKeys(e).perform();
		
	}
	
	public static void click() {
		
		Actions a=new Actions(driver);
		a.click().perform();		
	}
	
	public static void doubleClick(WebElement e) {
		
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
		
	}

	public static void contextClick(WebElement e) {
		
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
		
	}
	
	public static void keyBackspace(WebElement e) throws AWTException {
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		
	}
	
	public static void selectedByIndex(WebElement e,int a) {
		
		Select s=new Select(e);
		s.selectByIndex(a);
		
	}
	
	public static void selectByValue(WebElement e,String a) {
		
		Select s=new Select(e);
		s.selectByValue(a);
		
	}
	
	public static void selectByVisibleText(WebElement e,String a) {
		Select s=new Select(e);
		s.deselectByVisibleText(a);
		
	}
	
	public static List<WebElement> getOption(WebElement e) {
		Select s=new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
		
		
	}
	
	public static List<WebElement> getAllSelectedOption(WebElement e) {
		
		Select s=new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
		
	}
	
	public static WebElement getFirstSelected(WebElement e) {
		
		Select s=new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
		
	}
	
	public static void isMultiple(WebElement e) {

		Select s=new Select(e);
		s.isMultiple();
		
	}
	
	public static void accept() {
		
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
	
	public static void dismiss() {
		
		Alert a=driver.switchTo().alert();
		a.dismiss();
		
	}
	
	public static String getText(String e) {
		
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		return text;
		
	}
	
	public static void takeScreenShort(String a) throws IOException {
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\LENOVO\\eclipse-workspace\\SELENIUM_PROGRAMM\\Maven10\\src\\"+a+".png");
		FileUtils.copyFile(src, dest);
			
	}
	
	public static void passValue(WebElement e,String input) {
		
		e.sendKeys(input);
		
	}
	
	public static String readExcel(String a, String sheetName, int row, int cell) throws IOException {
		
		File f=new File("C:\\Users\\LENOVO\\eclipse-workspace\\SELENIUM_PROGRAMM\\Maven10\\src\\sheetExcel\\"+a+".xlsx");
		
		FileInputStream file=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(file);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		String value;
		if (cellType==1) {
			 value = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yy");
			value = s1.format(d);
		}
		else {
			double d = c.getNumericCellValue();
			long l=(long) d;
			value= String.valueOf(l);	
		}
		return value;
	}
	
	public static void createExcel(String a,String sheetName,int row,int cell, String string) throws IOException {
		
		File f=new File("C:\\Users\\LENOVO\\eclipse-workspace\\SELENIUM_PROGRAMM\\Maven10\\src\\test\\resources\\"+a+".xlsx");
		Workbook w=new XSSFWorkbook();
		
		Sheet s = w.createSheet(sheetName);
		Row r = s.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(string);
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
		System.out.println("-----write----");
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	}
	

