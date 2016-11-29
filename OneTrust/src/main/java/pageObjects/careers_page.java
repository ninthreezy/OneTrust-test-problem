package pageObjects;
	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
public class careers_page {
	
	public static List<WebElement> getCities(WebDriver driver){
		By mySelector = By.xpath("/html/body/section[2]/div/div/ul/li");
		List<WebElement> myElements = driver.findElements(mySelector);
		return myElements;
	}
	
	public static WebElement getCity(WebDriver driver){
		WebElement element = driver.findElement(By.id(""));
		return element;
	}
	
	public static void printJobsInThisCity(WebDriver driver, String city){
		//First find appropriate tab
		WebElement element = driver.findElement(By.id(city));
		System.out.println(element.toString());
	}
	
	public static WebElement position(WebDriver driver){
		WebElement element = driver.findElement(By.id("Position"));
		return element;
	}
	
	public static void printCities(WebDriver driver){
		By mySelector = By.xpath("/html/body/section[2]/div/div/ul/li");
		List<WebElement> myElements = driver.findElements(mySelector);
		for(WebElement e : myElements) {
		  System.out.println(e.getText());
		}
	}
}
