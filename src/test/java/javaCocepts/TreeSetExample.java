package javaCocepts;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a Java program to create a new tree set, add some colors (string) and print out the tree set
 * Write a Java program to iterate through all elements in a tree set.*/
		TreeSet<String> colors=new TreeSet<String>();
		  colors.add("Pink");
		  colors.add("Blue");
		  colors.add("Green");
		  colors.add("Orange");
		 /* Iterator<String> i=colors.iterator();
		  while (i.hasNext()) {
		System.out.println(i.next());	
		}
		  System.out.println(colors.size());
		  Write a Java program to add all the elements of a specified tree set to another tree set. 
		  TreeSet<String> colors1=new TreeSet<String>();
		  colors1.addAll(colors);
		  System.out.println(colors1);
		  Write a Java program to create a reverse order view of the elements contained in a given tree
		  Iterator<String> i=colors.descendingIterator();
		  while (i.hasNext()) {
		System.out.println(i.next());	
		}
		  Write a Java program to get the first and last elements in a tree set.
		System.out.print(colors.first());
		System.out.print(colors.last());
		 Write a Java program to clone a tree set list to another tree set.
		  TreeSet<String> colors1=new TreeSet<String>();
		  colors1=(TreeSet)colors.clone();
		  System.out.println(colors1);
		  Write a Java program to compare two tree sets
		  TreeSet<String> colors1=new TreeSet<String>();
		  colors1.add("Red");
		  colors1.add("White");
		  colors1.add("Pink");
		  colors1.add("Purple");
		  for (String string : colors1) {
			System.out.println(colors.contains(string)?"Yes":"No");
			Write a Java program to find the numbers less than 7 in a tree set*/
		  TreeSet<Integer> numbers=new TreeSet<Integer>();
		  numbers.add(2);
		  numbers.add(8);
		  numbers.add(6);
		  numbers.add(7);
		  
		/*  for (Integer integer : numbers) {
			if (integer<7) 
				System.out.println("True and the interger is "+integer);
			else
				System.out.println("False and the integer is "+integer);
		}
		  TreeSet<Integer> numbers1=new TreeSet<Integer>();
		 numbers1=(TreeSet)numbers.headSet(7);
		  Iterator<Integer> i=numbers1.iterator();
		  while(i.hasNext()){
			  System.out.println(i.next());
		  }
		  Write a Java program to get the element in a tree set which is greater than or equal to the given element.
		System.out.println(numbers.ceiling(2));
		 Write a Java program to get the element in a tree set which is less than or equal to the given 
			System.out.println(numbers.floor(8));
			 Write a Java program to get the element in a tree set which is less than or equal to the given 
		  //strictly higher and lower
			System.out.println(numbers.higher(2));
			System.out.println(numbers.lower(8));
			Write a Java program to retrieve and remove the first element of a tree set. */
		//retrieve and remove first and last numbers from treeset
		  System.out.println(numbers.pollFirst());
		System.out.println(numbers);
		System.out.println(numbers.pollLast());
		System.out.println(numbers);
		/* Java Priority Queue Tutorial with Examples

A priority queue in Java is a special type of queue wherein all the elements are ordered as per their natural ordering or based on a custom Comparator supplied at the time of creation.

The front of the priority queue contains the least element according to the specified ordering, and the rear of the priority queue contains the greatest element.*/
		//Insert an element in the priority queue
		//pq.offer("Blue");
		//Retrieve first element from priority queue
		//pq.peek();
		//retrieve and Remove the first elemnt
		//pq.poll();
		
	}
		  
		  
			
		
		  
		  
 
	}


