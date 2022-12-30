package orj.adactin;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel extends BaseClass{
	
	public AdactinHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement txtusername;
	
	@FindBy(name="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement btnlogin;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNo;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOut;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement audltRoom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childRoom;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement btnsearch1;
	
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement accNo;
	
	@FindBy(name="cc_type")
	private WebElement cardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement expireMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expireYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="book_now")
	private WebElement btnBook;
	
	public WebElement getAccNo() {
		return accNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public WebElement getExpireYear() {
		return expireYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	@FindBy(xpath="//input[@id='continue']")
	private WebElement btnContinue;
	
	public WebElement getBtnDropBox() {
		return btnDropBox;
	}

	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement btnDropBox;
	
	
	public WebElement getAudltRoom() {
		return audltRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getBtnsearch1() {
		return btnsearch1;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}
	
	
	
}
