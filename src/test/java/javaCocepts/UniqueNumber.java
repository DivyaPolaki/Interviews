package javaCocepts;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={8,2,8,9,2};
ArrayList<Integer> t=new ArrayList<Integer>();

for (int i = 0; i < a.length;i++) {
	
	int k=0;
	if (!t.contains(a[i])) {
		t.add(a[i]);	
		k++;
	}

	
	
	for (int j = i+1; j < a.length; j++) {
		
		if (a[i]==a[j]) {
			k++;
		}	
	
		
	}
	System.out.println(a[i]);
	System.out.println(k);
	if (k==1) {
		System.out.println(a[i]+" is unique number");

}

}


	}

}
