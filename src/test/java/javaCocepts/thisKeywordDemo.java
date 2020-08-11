package javaCocepts;



public class thisKeywordDemo {
int a=9;
public void getdata(){
	int a=8;
	//this keyord calls the global variable/object. Current object is called when this keyword is called
	System.out.println(a);
	System.out.println(this.a);
	int c=a+this.a;
	System.out.println(c);
		}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
thisKeywordDemo o=new thisKeywordDemo();
o.getdata();

}
}
