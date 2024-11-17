package AutomationFramework;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageValidation extends BaseTest {

	List<WebElement> links;
	String tablink=null;


	@Test(priority=-1)
	public void links() {
	driver.get("https://the-internet.herokuapp.com/");
	 links = driver.findElements(By.tagName("a"));
	 System.out.println("First Testcase of HomePageValidation");

		for (WebElement link : links) {

			if(link.getText().equalsIgnoreCase("Challenging DOM")) {
				tablink=link.getText();
				break;
				
			}
		}

	}
	@Test(priority=2)
	public void newTab() {
		
	WebElement li=	links.stream().filter(l->l.getText().equalsIgnoreCase(tablink)).findFirst().orElse(null);
		
		li.sendKeys(Keys.CONTROL,Keys.ENTER);
	
		System.out.println(driver.getTitle());
		 System.out.println("second Testcase of HomePageValidation");
	}
	@Test(priority=3)
	public void verifyWindowTitle() {
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow = it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		String Actualtext=driver.findElement(By.tagName("h3")).getText();
		String Expectded ="Challenging DOM";
		Assert.assertEquals(Actualtext, Expectded);
		 System.out.println("Third Testcase of HomePageValidation");
	
	
	}
	
	
	

}
