package javaCocepts;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="This is Divya";
String sr=s.replaceAll("This", "Divya");
System.out.println(sr);
String[] sa=sr.split(" ");
int sl = 0;
/*for (String st : sa) {
	if (st.equalsIgnoreCase("Divya")) {
		 sl=sa.length;
		
	}*/


System.out.println(sl);
	}

}
