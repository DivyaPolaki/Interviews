package Prep1;

import javaCocepts.ProtectedMethodChild_Practice;
import javaCocepts.ProtectedMethod_Practice;

public class ProtectMethodPractice_otherpckg extends ProtectedMethodChild_Practice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedMethod_Practice a=new ProtectedMethod_Practice();
		//a.m1();
		ProtectedMethodChild_Practice b=new ProtectedMethodChild_Practice();
		//b.m1();
		ProtectedMethod_Practice a1=new ProtectedMethodChild_Practice();
		//a1.m1();
		ProtectMethodPractice_otherpckg c=new ProtectMethodPractice_otherpckg();
		c.m1();
	}

}
