package javaCocepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> s=new HashSet<String>() ;
//set cannot accept duplicate values and the values added in set will not be in sequential order
//Set does not accept null values
s.add("Divya");
s.add("Phani");
s.add("Advilu");
s.add("Advilu");
//List can be added with index but set cannot be added with index
System.out.println(s);
s.remove("Advilu");
System.out.println("Hashset after removing the value "+s);
System.out.println(s.isEmpty());
Iterator<String> i=s.iterator();
while(i.hasNext()){
	i.next();

	
}
System.out.println(s);
























































	}

}
