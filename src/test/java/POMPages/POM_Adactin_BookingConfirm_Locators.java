package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Adactin_BookingConfirm_Locators {
	
	public static WebDriver driver;
	
	@FindBy(id = "my_itinerary")
	private WebElement my_itinerary;
	
	public POM_Adactin_BookingConfirm_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getmy_itinerary() {
		return my_itinerary;
	}

}
