package amazon;

import org.openqa.selenium.WebDriver;

import BaseComponent.InitDriver;

public class LoginPage extends InitDriver{
	
	
	
	WebDriver driver;
	
	
	
	
	
	public void login() {
		
		InitDriver login = new InitDriver();	
		
		driver=login.ChromeDriverinit();
		driver.manage().window().maximize();
		Catalouge lo= new Catalouge(driver);
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwj8vZHyl8yJAxXjSn8AHacLOikYABAAGgJvYQ&co=1&ase=2&gclid=Cj0KCQiA57G5BhDUARIsACgCYnzdDYbk4Ei0LwSXdBZg-aKfH4el3ZCfX-JcS_r0O7IFGfAszSqQpCEaAs7mEALw_wcB&ei=MLotZ82MCML3seMPuMnAkQc&ohost=www.google.com&cid=CAESVuD2tOzwZmnKahVqLnlmhTkTltTPK0sfQ_UHC_wUamCnd_3nD2oBc-MMV0xzhHlF6kTcRgh64hRLbWFy6z7XlL--zQgvbHiJZ6CmAABXA-SXiKDk7YY3&sig=AOD64_3h3qM1kYnNHxeXcKh7JEGTrS8jMQ&q&sqi=2&nis=4&adurl&ved=2ahUKEwjN5IPyl8yJAxXCe2wGHbgkMHIQ0Qx6BAgKEAE");	
		DineOut d = new DineOut(driver);
		
	}

}
