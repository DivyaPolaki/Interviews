package prep2_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void Login() throws IOException {
	  Properties prop=new Properties();
	  FileInputStream fis=new FileInputStream("C:\\Users\\Phani\\Documents\\selenium\\Interviews\\src\\test\\java\\prep2_Testng\\variables.properties");
	  
	  prop.load(fis);
	  
	  System.out.println("User name is "+prop.getProperty("UserName"));
  }
  }

  