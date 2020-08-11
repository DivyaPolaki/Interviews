/* Write a Java program to create a new array list, add some colors (string) and print out the collection.*/


package javaCocepts;

import java.util.*;


public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Write your code here
		/*  List<String> colors=new java.util.ArrayList<String>();
		  colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  System.out.println("The Arraylist colors are: "+colors);
		 
	}


Write a Java program to iterate through all elements in a array list.
		 List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  for (String color : colors) {
			System.out.println(color);
		}
		
		
Write a Java program to insert an element into the array list at the first position
		
		 List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		  for (String color : colors) {
			  System.out.println(color);
			
		}
Write a Java program to retrieve an element (at a specified index) from a given array list.
		 List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		  System.out.println(colors.get(2));
		  
		 Write a Java program to update specific array element by given element
		 List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		  System.out.println("Colors before update: "+colors);
		  colors.set(2, "Yellow");
		  System.out.println("Colors after update: "+colors);
		
		Write a Java program to remove the third element from a array list.
		 List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		  System.out.println("Colors before removal: "+colors);
		  colors.remove(2);
		  System.out.println("Colors after removal: "+colors);
		  
		  Write a Java program to search an element in a array list.
		 List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		  if (colors.contains("Orange")) 
			  System.out.println("True");
			  
		  else
			  System.out.println("False");
		  Write a Java program to sort a given array list.
		List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		Collections.sort(colors);
		
			System.out.println(colors);
		
			Write a Java program to copy one array list into another.
		List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		  List<String> colors1=new java.util.ArrayList<String>();
		  colors1.add("Purple");
		  colors1.add("Voilet");
		  colors1.add("Red");
		  colors1.add("Yellow");
		  
		  System.out.println("Two lists before copying: "+colors  +colors1);
		  Collections.copy(colors1, colors);
		  System.out.println("Two lists after copying: "+colors  +colors1);
		  Write a Java program to shuffle elements in a array list. 
		List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		  Collections.shuffle(colors);
		  System.out.println("List after shuffling:\n"+colors);
		  Write a Java program to reverse elements in a array list.
		List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		  Collections.reverse(colors);
		  System.out.println("List after reversal:\n"+colors);
		  Write a Java program to extract a portion of a array list
		List<String> colors=new java.util.ArrayList<String>();
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		 List<String> sublist=colors.subList(0, 3);
		 System.out.println("Portion of the array list: "+sublist);
		 Write a Java program to compare two array lists.*/
		List<String> colors=new java.util.ArrayList<String>(3);
		 colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add(0, "Orange");
		
		  List<String> colors1=new java.util.ArrayList<String>();
		  colors1.add("Purple");
		  colors1.add("Pink");
		  colors1.add("Red");
		  colors1.add("Yellow");
		 
	/*	if(colors.equals(colors1))
			System.out.println("True");
		else
			System.out.println("False");
	}
	
	*compare each one
		  List<String> colors3=new java.util.ArrayList<String>();
		  for (String e : colors) {
			  colors3.add(colors1.contains(e)?"Yes":"No");
		}
		  System.out.println(colors3);
		  Write a Java program of swap two elements in an array list. 
		  Collections.swap(colors1, 2, 0);
		  System.out.println(colors1);
		Write a Java program to join two array lists
		List<String> addedc=new java.util.ArrayList<String>();
		addedc.addAll(colors);
		addedc.addAll(colors1);
		System.out.println(addedc);
		Write a Java program to clone an array list to another array list
		Collections.copy(colors1, colors);
		System.out.println(colors1);
		Write a Java program to empty an array list.
		  colors1.removeAll(colors1);
		 
		  System.out.println(colors1);
		  Write a Java program to test an array list is empty or not.
		 
		  //colors1.removeAll(colors1);
		 // colors1.isEmpty() ?"Yes":"No";
		  if (colors1.isEmpty()) 
			System.out.println("Yes");
		  else
			  System.out.println("No");
		  Write a Java program to trim the capacity of an array list the current list size.
	//colors1.trimtosize();
		  //to increase capacity
		  //colors.ensurecapacity();
		  Write a Java program to replace the second element of a ArrayList with the specified element.
	colors.set(1, "New Color");
	System.out.println(colors);
	Write a Java program to print all the elements of a ArrayList using the position of the elements. */
	for (int i = 0; i < colors.size(); i++) {
		System.out.println(colors.get(i));
	}
	//convert array  to list
	//Array can be converted to list using Arrays.asList() method.
	
	}
}
