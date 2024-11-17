package amazon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileHandle {
	
	
	
	
	
	
	
	
	
	public void getGlobalvalues() throws IOException {
		
		Properties prop= new Properties();
		
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\amazon\\data.properties");
		prop.load(fis);
		
		
		
		System.out.println(prop.getProperty("user"));
		
		

		
		
		
	}

}
