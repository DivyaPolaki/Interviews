package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffHomePageTC {
	@Test
	public void tc1Method(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phani\\Documents\\Selenium Workspace\\Library\\Chromedriver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.rediffmail.com");
	RediffHome rf=new RediffHome(driver);
	rf.signIn().click();

	RediffLogin rl=new RediffLogin(driver)	;
	rl.userName().clear();
	rl.userName().sendKeys("dpolaki");
	rl.password().clear();
	rl.password().sendKeys("CGJan_2015");
	rl.goButton().click();
	}
}
