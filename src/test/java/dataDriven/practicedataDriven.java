package dataDriven;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.math3.distribution.GeometricDistribution;
import org.testng.annotations.Test;

public class practicedataDriven {
@Test

	public static void practicemethod() throws IOException{
		ExcelPractice ep=new ExcelPractice();
	
		System.out.println("Data on 2nd cell is "+ep.datadrivenpractice("Purchase").get(1));
		
	}
}
