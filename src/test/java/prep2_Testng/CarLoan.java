package prep2_Testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan{

	@Parameters({"URL"})
	@Test(groups={"Smoke"})
	public void clWebLogin(String urlName){
		System.out.println("This is Car loan login");
		System.out.println("URL name is "+urlName);
		assertTrue(false);

	}
	@Test
	public void clAPI(){
		System.out.println("This is API Car loan");
	}
	@Test(enabled=false)
	public void clMobile(){
		System.out.println("This is Car loan mobile");
	}
}
