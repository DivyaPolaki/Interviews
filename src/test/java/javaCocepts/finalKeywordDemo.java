package javaCocepts;

public class finalKeywordDemo {
final int a=9;
public void getdata(){
	final int a=9;
//this cannot be changed once it is final
	//methods can also be final//when class is final, then that class cannot be inheritted/extended
	//methods cannot be overridden once it is final
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalKeywordDemo o=new finalKeywordDemo();
		o.getdata();
	}

}
