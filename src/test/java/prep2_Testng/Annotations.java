package prep2_Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
public void Testbefore(){
	System.out.println("This comes before test");
}
	@Test
	public void Testingpersonalloan(){
	System.out.println("This is for persona loan testing");
}
	@Test(timeOut=4000)
	public void Testingpersonalloan2(){
	System.out.println("This is for persona loan testing2");
}
	@Test(dependsOnMethods={"Testingpersonalloan"})
	public void Testingpersonalloan3(){
	System.out.println("This is for persona loan testing3");
}
	@AfterTest
	public void Testafter(){
		System.out.println("This comes after test");
	}
	@BeforeMethod
	public void beforeeachmethod(){
		System.out.println("Executes before each method");
	}
		@AfterMethod
		public void aftereachmethod(){
			System.out.println("Executes after each method");
		}
		@BeforeClass
		public void beforeclass(){
			System.out.println("Executes before the class");
		}
		@AfterClass
		public void afterclass(){
			System.out.println("Executes after the class");
		}
	}
	

