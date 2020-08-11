package javaCocepts;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArraysBasics {

	public static void SingleDimentionalArray() {
		// TODO Auto-generated method stub
int a[] = new int[5];
//Allocating the memory and assigning the values
/*a[0]=9;
a[1]=8;
a[2]=7;
a[3]=5;
a[4]=3;
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}*/

//Allocating the values directly
//Max value in array
int b[]={9,8,7,0,3};
int max = b[0];
for (int i = 0; i < b.length; i++) {
	if (b[i]>max) {
		max=b[i];
	
	}

}
System.out.println(max);
	}
	
public static void minValueInArrayAndSort(){
	int b[]={9,0,7,5,3};
	int min = b[0];
	Arrays.sort(b);
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
			if (b[i]<min) {
				min=b[i];
			
				
		}
		
		

	}
	System.out.println(min);
	

}
@Test
public static void reverseArray(){
int b[]={9,0,7,5,3};
for (int i = b.length-1; i >= 0; i--) {
	System.out.println(b[i]);
}
}
	public static void MultiDimentionalArray(){
		int a[][]=new int[2][3];
		// int a[][]={{2,6,9},{3,5,8}};
		a[0][0]=2;
		a[0][1]=6;
		a[0][2]=9;
		a[1][0]=3;
		a[1][1]=5;
		a[1][2]=8;
		/* 2 6 9
		 * 3 5 8
		 */
		int max=a[0][0];
		int maxcol=0;
		int min=0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j]>max) {
					max=a[i][j];
				
					 maxcol=j;
				}
				
				 min=a[0][maxcol];
				int k = 0;
				while(k<2){
					if (a[i][maxcol]<min) {
						min=a[i][maxcol];
					
					}
					k++;
				}
			
			}
		}
		System.out.println("Min in column"+maxcol+" is "+min);
		System.out.println("Max in matrix is "+max);
		
	}
		
		
		


}
