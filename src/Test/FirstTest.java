package Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		//driver.findElement(By.xpath("//*[text()='OK']"));
		

		driver.findElement(By.xpath("(//*[@role='searchbox'])[1]")).sendKeys("Pune");

		driver.findElement(By.xpath("//*[contains(text(),' PUNE JN - PUNE ')]")).click();

		driver.findElement(By.xpath("(//*[@role='searchbox'])[2]")).sendKeys("Dharwar");

		driver.findElement(By.xpath("//*[contains(text(),' DHARWAR - DWR ')]")).click();
		
		driver.findElement(By.xpath("//*[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
		List<WebElement> dates=driver.findElements(By.xpath("//tr//td//a"));
		
		WebElement date=dates.stream().filter(s->s.getText().equalsIgnoreCase("20")).findFirst().orElse(null);
		date.click();
		
		driver.findElement(By.xpath("//*[@label='Find Trains']")).click();
	}

}
