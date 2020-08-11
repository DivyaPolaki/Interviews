package Prep1;

public class Fabinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8,13,21,34
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=8;i++){
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
		
	

	}

}
