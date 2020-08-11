package javaCocepts;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class HashsetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a Java program to append the specified element to the end of a hash set
 * Write a Java program to iterate through all elements in a hash list.
 * Write a Java program to get the number of elements in a hash set
 */
		HashSet<String> colors=new HashSet<String>();
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Voilet");
		colors.add("Pink");
		
		/*Iterator<String> i=colors.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		System.out.println("No. of elements in hashset are: "+colors.size());
		Write a Java program to empty an hash set
		Write a Java program to test a hash set is empty or not.
		colors.removeAll(colors);
		System.out.println(colors);
		System.out.println("Checking if hashset is empty: "+colors.isEmpty());
		Write a Java program to clone a hash set to another hash set
		HashSet<String> newset=new HashSet<String>();
		newset=(HashSet)colors.clone();
		System.out.println(newset);
		Write a Java program to convert a hash set to an array.
		String[] arrayc=new String[colors.size()];
		colors.toArray(arrayc);
		for (String string : arrayc) {
			System.out.println(string);
			}
			Write a Java program to convert a hash set to a tree set.
		TreeSet<String> ts=new TreeSet<String>(colors);
		System.out.println(ts);
		Write a Java program to convert a hash set to a List/ArrayList.
		List<String> al=new java.util.ArrayList<String>(colors);
		System.out.println(al);
		Write a Java program to compare two hash set.*/
		HashSet<String> newset=new HashSet<String>();
		newset.add("Pink");
		newset.add("Orange");
		newset.add("Red");
		newset.add("Yellow");
		

		/*for (String string : colors) {
			System.out.println(newset.contains(string)?"Yes":"No");
		}
		Write a Java program to compare two sets and retain elements which are same on both sets
		colors.retainAll(newset);
		System.out.println(colors);
		Write a Java program to remove all of the elements from a hash set*/
		colors.clear();
		System.out.println(colors);
	}
		
				
	}


