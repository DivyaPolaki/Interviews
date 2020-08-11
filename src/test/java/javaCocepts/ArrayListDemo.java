package javaCocepts;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(50);
		al.add(1,901);

		al.add(2, null);
		al.add(50);
		System.out.println("Array List with elements are "+al);
		System.out.println("Returns if the array list is empty or not "+al.isEmpty());
		al.remove(1);
		System.out.println("Array List after the value is removed "+al);
		//In ArrayList the elements are added sequentially and arraylist can also accept null values and duplicate values
		
	}

}
