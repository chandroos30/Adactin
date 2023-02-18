package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Adcatin_BookedItinerary_Locators {
	public static WebDriver driver;
	
	@FindBy(id = "logout")
	private WebElement logout_button;
	
	
	public POM_Adcatin_BookedItinerary_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout_button() {
		return logout_button;
	}
	
	

}
