package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Adactin_BookHotel_Locators {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement first_name;
	@FindBy(id = "last_name")
	private WebElement last_name;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement credit_card_number;
	@FindBy(id = "cc_type")
	private WebElement credit_card_type;
	@FindBy(id = "cc_exp_month")
	private WebElement credit_card_expiry_month;
	@FindBy(id = "cc_exp_year")
	private WebElement credit_card_expiry_year;
	@FindBy(id = "cc_cvv")
	private WebElement credit_card_cvv;
	@FindBy(id = "book_now")
	private WebElement booknow_button;
	
	public POM_Adactin_BookHotel_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit_card_number() {
		return credit_card_number;
	}

	public WebElement getCredit_card_type() {
		return credit_card_type;
	}

	public WebElement getCredit_card_expiry_month() {
		return credit_card_expiry_month;
	}

	public WebElement getCredit_card_expiry_year() {
		return credit_card_expiry_year;
	}

	public WebElement getCredit_card_cvv() {
		return credit_card_cvv;
	}

	public WebElement getBooknow_button() {
		return booknow_button;
	}
	
}

	

	
