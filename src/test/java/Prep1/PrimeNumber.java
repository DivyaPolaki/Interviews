package Prep1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=11;
		// TODO Auto-generated method stub
		boolean flag=true;
		for (int i = 2; i <=10; i++) {
		
				
			
			if (num%i==0) {
				flag=false;
				
			}
			
		}
		if (flag) {
			System.out.println(num+" is prime number");
		}
		else{
			System.out.println(num+" is not prime number");
		}
		}

	}


