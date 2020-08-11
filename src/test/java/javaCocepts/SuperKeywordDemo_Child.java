package javaCocepts;

public class SuperKeywordDemo_Child extends SuperkeywordDemo_Parent{

	String name="Child";
	 public SuperKeywordDemo_Child(){
		 super();
		 System.out.println("Child constructor");
	 }
	 public void getdata(){
		 super.getdata();
			System.out.println("This is a method from child");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeywordDemo_Child obj=new SuperKeywordDemo_Child();
		
	obj.getdata();
	}
	
	

}