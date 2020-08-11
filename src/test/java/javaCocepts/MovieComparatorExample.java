package javaCocepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieComparatorExample {

	public static void main(String[] args) {
		String sortBy="Year";
		// TODO Auto-generated method stub
		List<Movie> m=new java.util.ArrayList<Movie>();
		Movie m1=new Movie("The Good Place",2017, 4.5);
		Movie m2=new Movie("Lord Of the Rings",2000, 5);
		Movie m3=new Movie("Oh Baby", 2019,4);
		Movie m4=new Movie("Manchi Manushulu", 1986, 3);
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		if (sortBy.equalsIgnoreCase("Name")) 
		Collections.sort(m, new mycomparator_Name());
		else if(sortBy.equalsIgnoreCase("Rating"))
			Collections.sort(m, new mycomparator_Rating());
		else
			Collections.sort(m, new mycomparator_Year());
		System.out.println(m);
		
		
	}

	

}
class Movie {
	public String Name;
	public int year;
	public double rating;
public Movie(String Name,int year,double rating){
	this.Name=Name;
	this.year=year;
	this.rating=rating;
	
	
}
@Override
public String toString() {
	return Name+"--"+year+"--"+rating;
}

}

class mycomparator_Year implements Comparator<Movie>{

	@Override
	public int compare(Movie y1, Movie y2) {
		// TODO Auto-generated method stub
		Movie oy1=(Movie)y1;
		Movie oy2=(Movie)y2;
		if (oy1.year>oy2.year) 
return -1;
		else if (oy1.year<oy2.year) 
			return +1;
		
		return 0;
	}
	
}
class mycomparator_Name implements Comparator<Movie>{

	@Override
	public int compare(Movie N1, Movie N2) {
		// TODO Auto-generated method stub
		Movie oN1=(Movie)N1;
		Movie oN2=(Movie)N2;
		return oN2.Name.compareTo(oN1.Name);
	}
}
class mycomparator_Rating implements Comparator<Movie>{

	@Override
	public int compare(Movie r1, Movie r2) {
		// TODO Auto-generated method stub
		Movie or1=(Movie)r1;
		Movie or2=(Movie)r2;
		if (or1.rating>or2.rating) 
return -1;
		else if (or1.rating<or2.rating) 
			return +1;
		
		return 0;
	}
	
}
