package Prep1;

import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,6,9,8};
		int b[]={4,6,7,8};
		ArrayList<Integer> c=new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			
		
		if (a[i]==b[i]) {
			c.add(a[i]);
		}
		}
		Object[] c1=c.toArray();
		for (Object object : c1) {
			System.out.println(object);
		}

	}

}
