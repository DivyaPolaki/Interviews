package Prep1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="liril";
String rs="";
for (int i=s.length()-1;i>=0;i--) {
	s.charAt(i);
	rs=rs+s.charAt(i);
	
}
if (rs.equals(s)) {
	System.out.println("true");
}
else{
	System.out.println("false");
}
	}

}
