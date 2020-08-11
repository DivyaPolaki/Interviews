package javaCocepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> m=new HashMap<String, Integer>();
m.put("Divya", 1);
m.put("Phani", 1);
m.put("Advilu", 3);
System.out.println(m.get("Divya"));
Set sm=m.entrySet();
Iterator i=sm.iterator();
while(i.hasNext()){
	Map.Entry<String, Integer> mp=(Map.Entry<String, Integer>)i.next();
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());
}

	}

}
//HashMap is not synchronised and not threadsafe whereas hashTableis synchronized amd threadsafe
//HashTable uses ennumerator
