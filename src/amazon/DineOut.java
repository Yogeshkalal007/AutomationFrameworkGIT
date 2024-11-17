package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DineOut {

	WebDriver driver;

	public DineOut(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[@class='sc-dchYKM onvsl'])[1]")
	WebElement clickondine;
	
	
	
	@FindBy(xpath="")
	List<WebElement> dineoutbuttons;

	public void clickOnDine() {

		clickondine.click();
	}

	public void dineOutButtons(String button) {

	
		WebElement bu = dineoutbuttons.stream().filter(b -> b.getText().equalsIgnoreCase(button)).findFirst().orElse(null);
		bu.click();

	}

}
