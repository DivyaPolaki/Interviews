package Prep1;

import java.util.ArrayList;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={5,7,2,9,10};
ArrayList<Integer> b=new ArrayList<>();
//compare each index of the array with every other index
int temp;
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]<a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
	
		}
	}
}
for (int i = 0; i < a.length; i++) {
	b.add(a[i]);
	
}
System.out.println(b);
	}

}
