package amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Comp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LoginPage log= new LoginPage();
		log.login();
		DineOut dine= new DineOut(log.driver);
        dine.clickOnDine();
        dine.dineOutButtons("Offers");
		
        TakesScreenshot ts =  (TakesScreenshot)log.driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        
        File Destination = new File(System.getProperty("user.dir")+"\\reports\\zomato.png");
        
		FileUtils.copyFile(source, Destination);
		
	}

}
