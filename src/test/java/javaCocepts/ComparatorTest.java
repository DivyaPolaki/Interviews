package javaCocepts;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
	public static void main(String[] args) {
		List<Student> students = new java.util.ArrayList<>();
		
		String sortby = "Name";
		
		Student stud1 = new Student();
		stud1.setRollNo(30);
		stud1.setName("ZirstStud");
		
		Student stud2 = new Student();
		stud2.setRollNo(20);
		stud2.setName("SecondStud");
		
		students.add(stud1);
		students.add(stud2);
		
		System.out.println(students);
		
		Comparator rollNoCompare = new StudentRollNoCompare();
		
		if(sortby.equalsIgnoreCase("RollNo")){
			
			Collections.sort(students, rollNoCompare);
		}else{
			
			Collections.sort(students, new StudentNameCompare() );
		}
		
		System.out.println(students);
		
		
	}

}

class Student {

	private int rollNo;
	private String name;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
}

class StudentRollNoCompare implements Comparator<Student> {

	public int compare(Student stud1, Student stud2) {
		int compResult = 0;
		if (stud1.getRollNo() > stud2.getRollNo()){
			compResult = 1;
		}
		else if (stud1.getRollNo() < stud2.getRollNo()){
			compResult = -1;
		}
		return compResult;
	}

}

class StudentNameCompare implements Comparator<Student> {

	public int compare(Student stud1, Student stud2) {
		return stud1.getName().compareTo(stud2.getName());
	}
	
}