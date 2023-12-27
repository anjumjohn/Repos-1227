package hooks;

import utilities.ConfigReader;
import io.cucumber.java.BeforeAll;

public class Hooks {
	
	private static DriverBase db;
	
	//static DriverBase db = new DriverBase();

	@BeforeAll
	public static void before() {
		
		ConfigReader.loadConfig(); //load from config.properties file
		String browser = ConfigReader.getBrowserType();//Get browser type from config.properties file
		
		db = new DriverBase();
		db.initializeDriver(browser); //Initialize driver from DriverBase

}
}
