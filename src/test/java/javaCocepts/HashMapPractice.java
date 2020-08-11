package javaCocepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to associate the specified value with the specified key in a HashMap.
	HashMap<Integer, String> hashmap=new HashMap<Integer, String>();
	  	hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
	
	/*System.out.println(colors);
	//get size or count
	
	System.out.println(colors.size());
	//Write a Java program to copy all of the mappings from the specified map to another map.
	
	HashMap<Integer, String> colors1=new HashMap<Integer, String>();
	colors1.put(5, "White");
	colors1.put(6, "Indigo");
	colors1.put(7, "Black");
	colors1.put(8, "Blue");
colors1.putAll(colors);
System.out.println(colors1);
//remove mappings
colors.clear();
System.out.println(colors);
System.out.println(colors.isEmpty());
//clone
colors=(HashMap)colors1.clone();
System.out.println(colors);
if (colors.containsKey(2)) 
	System.out.println("Yes");
else
	System.out.println("No");
	if (colors.containsValue("Orange")) 
		System.out.println("Yes");
	else
		System.out.println("No");
	
	//Write a Java program to create a set view of the mappings contained in a map.
	
	Set cs=colors1.entrySet();

	System.out.println(cs);
	System.out.println(colors.get(2));
	//Write a Java program to get a set view of the keys contained in this map.
	Set keyset=colors.keySet();
	System.out.println(keyset);
	//Write a Java program to get a collection view of the values contained in this map.
	System.out.println(colors.values());
	convert hashmap to treema*/
	    
	    System.out.println("Before Sorting:");
	    Set set = hashmap.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) {
	     Map.Entry pair=(Map.Entry)iterator.next();
	   
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	    }
	    Map<Integer,String> tmap=new java.util.TreeMap<Integer, String>(hashmap);
	    System.out.println("After Sorting:");
	   
	    Set set2 = tmap.entrySet();
	    Iterator iterator2 = set2.iterator();
	    while(iterator2.hasNext()) {
	        Map.Entry pair = (Map.Entry)iterator2.next();
	      
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	    }
	  /*  List<String> synchronizedarraylist = 
	    	       Collections.synchronizedList(new ArrayList());*/
		
		HashMap<Integer, String> colors1=new HashMap<Integer, String>();
		colors1.put(5, "White");
		colors1.put(6, "Indigo");
		colors1.put(7, "Black");
		colors1.put(8, "Blue");
		System.out.println(colors1.get(5));
		
	}
	
	}
