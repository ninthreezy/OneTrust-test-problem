package automationFramework;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.careers_page;

public class firstTestCase {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException{	
		
		// Create a new instance of the driver and open careers page
		System.setProperty("webdriver.chrome.driver", "/home/michael/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://onetrust.com/careers.html");
	
		// Use page object library now
		List<WebElement> cities = careers_page.getCities(driver);
		for(int i=0; i<cities.size(); i++){
			System.out.println(cities.get(i).getText());
			careers_page.printJobsInThisCity(driver, cities.get(i).getText());
		}

	}
}
