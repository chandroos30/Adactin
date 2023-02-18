package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Adcatin_SearchHotel_Locators {
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement room_type;
	@FindBy(id = "room_nos")
	private WebElement number_of_rooms;
	@FindBy(id = "datepick_in")
	private WebElement check_in_date;
	@FindBy(id = "datepick_out")
	private WebElement check_out_date;
	@FindBy(id = "adult_room")
	private WebElement adults_per_room;
	@FindBy(id = "child_room")
	private WebElement children_per_room;
	@FindBy(id = "Submit")
	private WebElement search;
	
	public POM_Adcatin_SearchHotel_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getNumber_of_rooms() {
		return number_of_rooms;
	}
	public WebElement getCheck_in_date() {
		return check_in_date;
	}
	public WebElement getCheck_out_date() {
		return check_out_date;
	}
	public WebElement getAdults_per_room() {
		return adults_per_room;
	}
	public WebElement getChildren_per_room() {
		return children_per_room;
	}
	public WebElement getsearch() {
		return search;
	}
	

}
