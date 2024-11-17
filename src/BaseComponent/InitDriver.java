package BaseComponent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitDriver {

	
	
	WebDriver driver;
	
	
	public WebDriver ChromeDriverinit() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();	
		 
		 return driver;
		
	}
}
