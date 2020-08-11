package Prep1;

public class SumofNumsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sa=sumMethod();
		System.out.println(sa);
		int mu=multiplyMethod(5,10);
		System.out.println("Multiplication: "+mu);
		SumofNumsArray.multiply(5,10);
		
	}
	public static int sumMethod(){
		int[] a={20,40,67,89,56};
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		return sum;
		
	}
	//Print 5 mu;tiplication without using multiply operator
	
	public static int multiplyMethod(int i, int j){
		//i should be added j times to get the multiplication
		int sum=0;
		
		for (int k = 1; k <= j; k++) {
		sum=sum+i;	
		}
		
	return sum;	
		
		
	}
	public static int multiply(int i,int j){
		//i has to multiply j times
		int sum=0;
		for (int k=1;k<=j;k++) {
			sum=sum+i;
			System.out.println(i+"X"+k+"="+sum);
		}
	return sum;
	}
	

}
