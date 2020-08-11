package javaCocepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class LinkedListPractice {

	public static void main(String[] args) {
		/*Write a Java program to iterate through all elements in a linked list
		// TODO Auto-generated method stub
		List<String> colors=new LinkedList();
		colors.add("Yellow");
		colors.add("Red");
		colors.add("White");
		
		Iterator<String> i=colors.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
			Write a Java program to iterate through all elements in a linked list starting at the specified position*/
		
		LinkedList<String> colors=new LinkedList<String>();
		colors.add("Yellow");
		colors.add("Red");
		colors.add("White");
		
		/*for (int i = 1; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		Iterator<String> c=colors.listIterator(1);
		while (c.hasNext()) {
			
			System.out.println(c.next());;
			
		}
			
		}
	 Write a Java program to iterate a linked list in reverse order.
		//Collections.reverse(colors);*/
		
		/*Iterator<String> i=colors.descendingIterator();
		while(i.hasNext()){
		System.out.println(i.next());
		}
		/*Write a Java program to insert the specified element at the specified position in the linked list. 
	colors.add(1, "Pink");;
	System.out.println(colors);
	Write a Java program to insert elements into the linked list at the first and last position.
	colors.addFirst("Pink");
	colors.addLast("Purple");
	System.out.println(colors);
	
	Write a Java program to insert the specified element at the front of a linked list.
		
		colors.offerFirst("Pink");
		System.out.println(colors);
		Write a Java program to insert the specified element at the front of a linked list.
		colors.offerLast("Pink");
		System.out.println(colors);
		Write a Java program to insert some elements at the specified position into a linked list.*/
		LinkedList<String> newlist=new LinkedList<String>();
		newlist.add("voilet");
		newlist.add("Pink");
		newlist.add("White");
		
		/*colors.addAll(1, newlist);
		System.out.println(colors);
		Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	System.out.println(colors.getFirst());
	System.out.println(colors.getLast());
	Write a Java program to display the elements and their positions in a linked list.
	for (int i=0;i<colors.size();i++) {
		System.out.println("Element at index "+i+" for "+colors.get(i));
	}
	Write a Java program to remove a specified element from a linked list.
	//colors.remove("Yellow");
	colors.remove(2);
	System.out.println(colors);
	Write a Java program to remove first and last element from a linked list.
		colors.removeFirst();
		colors.removeLast();
		System.out.println(colors);
		Write a Java program to remove all the elements from a linked list.
		colors.clear();
		System.out.println(colors);
		Write a Java program of swap two elements in an linked list.
		Collections.swap(colors, 1, 0);
		System.out.println(colors);
		Write a Java program to shuffle the elements in a linked list. 
		Collections.shuffle(colors);
		System.out.println(colors);
		Write a Java program to join two linked lists.
		LinkedList<String> newest=new LinkedList<String>();
		newest.addAll(colors);
		newest.addAll(newlist);
		System.out.println(newest);
		 Write a Java program to clone an linked list to another linked list.
		LinkedList<String> newest=(LinkedList<String>)colors.clone();
		System.out.println(newest);
		Write a Java program to remove and return the first element of a linked list. 
		
		System.out.println("Removed element is "+colors.pop());
		System.out.println(colors);
		Write a Java program to retrieve but does not remove, the last element of a linked list.
		System.out.println("Retriev last element is "+colors.peekLast());
		System.out.println("Original list: "+colors);
		Write a Java program to retrieve but does not remove, the first element of a linked list.
		System.out.println("Retriev first element is "+colors.peekFirst());
		System.out.println("Original list: "+colors);
		Write a Java program to convert a linked list to array list.
		List<String> arraylist=new ArrayList<String>(colors);
		for (String string : arraylist) {
			System.out.println(string);
			}
			 Write a Java program to compare two linked lists.
		LinkedList<String> l=new LinkedList<String>();
	for (String s : newlist) {
		l.add(colors.contains(s)?"Yes":"No");
		
	}
	System.out.println(l);
	Write a Java program to test an linked list is empty or not.
		colors.removeAll(colors);
		System.out.println("check if empty or not "+colors.isEmpty());
		Write a Java program to replace an element in a linked list.*/
		colors.set(2, "Newcolor");
		System.out.println(colors);
		
	}
}

	


