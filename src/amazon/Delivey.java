package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delivey {

	WebDriver driver;

	public Delivey(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="(//*[@class='sc-dchYKM onvsl'])[2]")
	WebElement clickondelivery;
	
	
	
	
	public void clickOnDelivery() {

		clickondelivery.click();

	}
}
