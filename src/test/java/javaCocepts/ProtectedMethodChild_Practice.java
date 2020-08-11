package javaCocepts;

public class ProtectedMethodChild_Practice extends ProtectedMethod_Practice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ProtectedMethod_Practice a=new ProtectedMethod_Practice();
			a.m1();
			ProtectedMethodChild_Practice b=new ProtectedMethodChild_Practice();
			b.m1();
			ProtectedMethod_Practice a1=new ProtectedMethodChild_Practice();
			a1.m1();
			}

	}

