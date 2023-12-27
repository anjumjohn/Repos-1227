package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties prop = new Properties();
	public static String propPath = "src/test/resources/config/config.properties";
	
	public static void loadConfig() {
		
		try {
			FileInputStream fis = new FileInputStream(propPath);
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("config.properties file is not found at "+propPath);
		}
	}
	
	public static String getBrowserType() {
		
		String browser = prop.getProperty("browser");
		
		if (browser!=null) {
			return browser;
		}
		else {
			throw new RuntimeException ("browser not specified in config.properties file");
		}
		
		
	}
	
	public static String getApplicationUrl() {
		
		String url = prop.getProperty("url");
		
		if(url!=null) {
			return url;
		}
		else {
			throw new RuntimeException("url not specified in config.properties file");
		}
	}

}
