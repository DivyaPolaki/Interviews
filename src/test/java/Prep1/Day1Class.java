package Prep1;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;


public class Day1Class {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phani\\Documents\\Selenium Workspace\\Library\\Chromedriver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");
	}

}
