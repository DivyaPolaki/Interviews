package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javaCocepts.ArraysBasics;

public class RediffHome {
	


WebDriver driver;
	public RediffHome(WebDriver driver) {
	// TODO Auto-generated constructor stub
		driver=this.driver;
}

	

	By signIn=By.xpath("//a[@title='Already a user? Sign in']");
	
	public WebElement signIn(){
		return driver.findElement(signIn);

		
	}
	
}


