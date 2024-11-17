package AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EdigeTestcases extends BaseTest {


	@Test
	public void dropDown() {
		
		
		driver.get("https://the-internet.herokuapp.com/");
		 System.out.println("First Testcase of EdigeTestcases");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {

			if (link.getText().equalsIgnoreCase("Dropdown")) {

				link.click();
				break;
			}

		}

		// links.stream().filter(li->li.getText().equalsIgnoreCase("Dropdown")).findFirst().orElse(null).click();
		// l.click();
		
		
		Select drop= new Select(driver.findElement(By.id("dropdown")));
		drop.selectByIndex(1);

	}
	
	@Test
	public void checkBox() {
		
		
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).click();
		 System.out.println("Second Testcase of EdigeTestcases");
	}
	
	public void statuscode() {
		
		
		
		driver.get("https://the-internet.herokuapp.com/status_codes");
		
		driver.findElement(By.xpath("(//li//a)[1]")).click();
	}

}
