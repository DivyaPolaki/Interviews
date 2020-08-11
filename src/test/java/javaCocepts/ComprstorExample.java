package javaCocepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComprstorExample {

	public static void main(String[] args) {
		List<EmployeeDetails> ed=new java.util.ArrayList<>();
		EmployeeDetails e1=new EmployeeDetails();
		e1.setEmployeeID(234);
		e1.setEmployeeName("zfg");
		
		EmployeeDetails e2=new EmployeeDetails();
		e2.setEmployeeID(456);
		e2.setEmployeeName("ngf");
		
		ed.add(e1);
		ed.add(e2);
		Collections.sort(ed);
		System.out.println(ed);
		
		}
}
	 class EmployeeDetails implements Comparable{
		@Override
		public String toString() {
			return "EmployeeDetails [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + "]";
		}
		private int EmployeeID;
		private String EmployeeName;
		
	public int getEmployeeID(){
		
		return EmployeeID;
		
	}
	public void setEmployeeID(int EmployeeID){
		this.EmployeeID=EmployeeID;
	
		
	};
	public String getEmployeeName(){
		
		return EmployeeName;
		
	}
	public void setEmployeeName(String EmployeeName){
		this.EmployeeName=EmployeeName;
		
		
	}
	@Override
	public int compareTo(Object o1) {
		// TODO Auto-generated method stub
		
		String EmpN=this.EmployeeName;
		EmployeeDetails EmpN2=(EmployeeDetails)o1;
		
		return EmpN.compareTo(EmpN2.getEmployeeName());
	
	};
	
	}
 class EmployeeRollNoCompare implements Comparator<EmployeeDetails>{

		@Override
		public int compare(EmployeeDetails e1, EmployeeDetails e2) {
			// TODO Auto-generated method stub
			if (e1.getEmployeeID()<e2.getEmployeeID())
				return -1;
			else if (e1.getEmployeeID()>e2.getEmployeeID()) 
				return +1;
			return 0;
					
				
		
		
	}
	
					
				
		
		
	

				
			
	
	
}


