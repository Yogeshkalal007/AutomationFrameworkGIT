package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Catalouge {
	
	
	
	WebDriver driver;
	
	public Catalouge(WebDriver driver) {
		
		
		this.driver=driver;
		
	}
	
	
	
	
	
	
	public void clickMenu() {
		
		
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		
		
	}
	
	

}
