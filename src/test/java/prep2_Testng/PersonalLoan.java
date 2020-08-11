package prep2_Testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonalLoan extends Listeners{
	@BeforeSuite
	public void beforesuite(){
		System.out.println("This comes before suite");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("This comes after suite");
	}
	@Test
public void plWebLogin(){
	System.out.println("This is personal loan login");

}
	@Test(groups={"Smoke"})
public void plAPI(){
	System.out.println("This is API personal loan");
}
	@Test(dataProvider="getData")
public void plMobile(String  username, String password){
	System.out.println("This is personal loan mobile");
	System.out.println(username);
	System.out.println(password);
}
	@DataProvider
	public Object getData(){
		Object[][] data=new Object[3][2];
		data[0][0]="firsrusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpssword";
		
		return data;
		
	}
}
