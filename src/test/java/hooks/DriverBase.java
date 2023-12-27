package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverBase {
	
	public static WebDriver driver;
	
	public WebDriver initializeDriver(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = WebDriverManager.chromedriver().create();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = WebDriverManager.safaridriver().create();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = WebDriverManager.firefoxdriver().create();
		}
		else if (browser.equalsIgnoreCase("edge")) {
				driver=WebDriverManager.edgedriver().create();
			}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static WebDriver getDriver() {
		
		return driver;

	}

}
