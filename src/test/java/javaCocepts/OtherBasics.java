package javaCocepts;

import org.testng.annotations.Test;

public class OtherBasics {
	@Test(enabled=false)
	public static void sumOfIntegersInArray(){
		int[] i={2, 3,9,5,12};
		int k=0;
		for (int j = 0; j < i.length; j++) {
			k=k+i[j];
		}
		System.out.println(k);
	}
	@Test
	public static void printIndex(){
		int[] i={2,3,9,5,12};
		for (int j = 0; j < i.length; j++) {
			if (i[j]==9) {
				System.out.println("Index of number 9 is "+j);
				break;
			}
			
		}
		}
	public static void main(String[] args){
		System.out.println("Hello");
	}
	
	
	}


