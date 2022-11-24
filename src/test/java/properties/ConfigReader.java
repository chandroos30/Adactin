package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {
	
	public static Properties po;
	
	public ConfigReader() throws Exception {
		
		File file = new File("C:\\Users\\chandru\\eclipse-workspace\\Adactin\\src\\test\\java\\properties\\Configuration.Properties");
		FileInputStream fis = new FileInputStream(file);
		po = new Properties();
		po.load(fis);	
	}
	
	public String getBrowser() {
		String browser = po.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = po.getProperty("url");
		return url;
	}
	 

}
