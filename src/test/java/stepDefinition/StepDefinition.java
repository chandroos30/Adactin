package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClass;

import POMPages.POM_Adactin_BookHotel_Locators;
import POMPages.POM_Adactin_BookingConfirm_Locators;
import POMPages.POM_Adactin_Login_Page_Locators;
import POMPages.POM_Adactin_SelectHotel_Locators;
import POMPages.POM_Adcatin_BookedItinerary_Locators;
import POMPages.POM_Adcatin_SearchHotel_Locators;
import helper.FileReaderManager;
import io.cucumber.java.en.*;
import runner.AdactinRunner;


public class StepDefinition extends BaseClass{
	public static WebDriver driver = AdactinRunner.driver;
	POM_Adactin_Login_Page_Locators loginpage = new POM_Adactin_Login_Page_Locators(driver);
	POM_Adcatin_SearchHotel_Locators searchhotelpage = new POM_Adcatin_SearchHotel_Locators(driver);
	POM_Adactin_SelectHotel_Locators selecthotelpage = new POM_Adactin_SelectHotel_Locators(driver);
	POM_Adactin_BookHotel_Locators bookhotelpage= new POM_Adactin_BookHotel_Locators(driver);
	POM_Adactin_BookingConfirm_Locators bookingconfirmpage = new POM_Adactin_BookingConfirm_Locators(driver);
	POM_Adcatin_BookedItinerary_Locators bookeditinerarypage = new POM_Adcatin_BookedItinerary_Locators(driver);
	
	//------------------------LoginPage------------------------//
	@Given("user enters valid login page url of Adactin application")
	public void user_enters_valid_login_page_url_of_adactin_application() throws Exception {
		String url = FileReaderManager.getFrmInstance().getCrInstance().getUrl();
	    getUrl(url);
	    implicitWait(10, "seconds");
	    windowMaximize();
	}

	@When("user enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String string, String string2) {
		findElement(loginpage.getUsername(), "sendkeys", string);
		findElement(loginpage.getPassword(), "sendkeys", string2);
	}

	@Then("user validates entered username and password")
	public void user_validates_entered_username_and_password() {
		String attribute2 = loginpage.getUsername().getAttribute("value");
		System.out.println(attribute2);
		String attribute = loginpage.getPassword().getAttribute("value");
		System.out.println(attribute);
	}

	@Then("user clicks login button")
	public void user_clicks_login_button() {
	    findElement(loginpage.getlogin_button(), "click", "");
	    implicitWait(3, "second");
	}

	@Then("user moves to Adactin Search Hotel page")
	public void user_moves_to_adactin_search_hotel_page() {
	    System.out.println("User moved to Search Hotel Page");
	}
	//------------------------SearchHotelPage------------------------//
	@When("user selects hotel location")
	public void user_selects_hotel_location() {
		dropdown(searchhotelpage.getLocation(), "value", "Paris");
		implicitWait(1, "second");
	}

	@When("user selects hotel")
	public void user_selects_hotel() {
		dropdown(searchhotelpage.getHotels(), "value", "Hotel Sunshine");
		implicitWait(1, "second");
	}

	@When("user selects room type")
	public void user_selects_room_type() {
		dropdown(searchhotelpage.getRoom_type(),"Value", "Deluxe");
		implicitWait(1, "second"); 
	}

	@When("user selects number of rooms")
	public void user_selects_number_of_rooms() {
		dropdown(searchhotelpage.getNumber_of_rooms(), "index", "2");
		implicitWait(1, "second");
	   
	}

	@When("user enters check in date")
	public void user_enters_check_in_date() {
		findElement(searchhotelpage.getCheck_in_date(), "clear", "09/10/2022");
		implicitWait(1, "second");
	   
	}

	@When("user enters check out date")
	public void user_enters_check_out_date() {
		findElement(searchhotelpage.getCheck_out_date(), "clear", "10/10/2022");
		implicitWait(1, "second");
	}

	@When("user selects adults per room")
	public void user_selects_adults_per_room() {
		dropdown(searchhotelpage.getAdults_per_room(), "value", "2");
		implicitWait(1, "second");
	   
	}

	@When("user selects children per room")
	public void user_selects_children_per_room() {
		dropdown(searchhotelpage.getChildren_per_room(), "visibletext", "2 - Two");
		implicitWait(1, "second");
	   
	}

	@When("user clicks search button")
	public void user_clicks_search_button() {
		findElement(searchhotelpage.getsearch(), "click", "");
		implicitWait(1, "second");
	}

	@Then("user moves to Select Hotel page")
	public void user_moves_to_select_hotel_page() {
		System.out.println("User moved to Select Hotel Page");
		implicitWait(5, "seconds");
	}
	//------------------------SelectHotelPage------------------------//
	@When("user click radio button")
	public void user_click_radio_button() {
		findElement(selecthotelpage.getRadiobutton(), "click", "");
		implicitWait(500000, "microseconds");
	}

	@When("user clicks continue button")
	public void user_clicks_continue_button() {
		findElement(selecthotelpage.getSubmit(), "click", "");
		implicitWait(500000, "microseconds");
	}

	@Then("user moves to Book Hotel page")
	public void user_moves_to_book_hotel_page() {
		System.out.println("User moved to Book Hotel Page");
		implicitWait(5, "seconds");
	}
	//------------------------BookHotelPage------------------------//
	@When("user enters first name {string} and lastname {string}")
	public void user_enters_first_name_and_lastname(String string, String string2) {
		findElement(bookhotelpage.getFirst_name(), "sendkeys", string);
		findElement(bookhotelpage.getLast_name(), "sendkeys", string2);
		implicitWait(500000, "microseconds");
	}

	@When("user enters billing address {string}")
	public void user_enters_billing_address(String string) {
		findElement(bookhotelpage.getAddress(), "sendkeys", string);
		implicitWait(500000, "microseconds");
	}

	@When("user enters credit card no. {string}")
	public void user_enters_credit_card_no(String string) {
		findElement(bookhotelpage.getCredit_card_number(), "sendkeys", string);
		implicitWait(500000, "microseconds"); 
	}

	@When("user selects credit card type")
	public void user_selects_credit_card_type() {
		dropdown(bookhotelpage.getCredit_card_type(), "value", "VISA");
		implicitWait(500000, "microseconds");
	}

	@When("user selects credit card expiry month and credit card expiry year")
	public void user_selects_credit_card_expiry_month_and_credit_card_expiry_year() {
		dropdown(bookhotelpage.getCredit_card_expiry_month(), "value", "2");
		implicitWait(500000, "microseconds");
		dropdown(bookhotelpage.getCredit_card_expiry_year(), "value", "2014");
		implicitWait(500000, "microseconds");
	}

	@When("user enters cvv no. {string}")
	public void user_enters_cvv_no(String string) {
		findElement(bookhotelpage.getCredit_card_cvv(), "sendkeys", string);
		implicitWait(500000, "microseconds");
	}
	
	@When("user clicks book now button")
	public void user_clicks_book_now_button() {
		findElement(bookhotelpage.getBooknow_button(), "click", "");
		implicitWait(10, "seconds");
	}

	@Then("user moves to Booking Confirm page")
	public void user_moves_to_booking_confirm_page() {
		System.out.println("User moved to Booking Confirm Page");
	}
	//------------------------BookingConfirmPage------------------------//
	@When("user clicks my itenerary button")
	public void user_clicks_my_itenerary_button() {
		findElement(bookingconfirmpage.getmy_itinerary(), "click", "");
	    implicitWait(10, "seconds");
	}
	
	@Then("user moves to Booked itenarary page")
	public void user_moves_to_booked_itenarary_page() {
	    System.out.println("User moved to BookedItenararyPage");
	}
	//------------------------BookedItenararyPage------------------------//
	@When("user clicks logout button")
	public void user_clicks_logout_button() {
		findElement(bookeditinerarypage.getLogout_button(), "click", "");
	}
	
	@Then("user should have logged out of Adactin hotel application")
	public void user_should_have_logged_out_of_adactin_hotel_application() {
		System.out.println("User logged out of Adactin hotel application");	
		implicitWait(3, "seconds");
	}
	
}
