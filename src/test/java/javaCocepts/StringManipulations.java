package javaCocepts;

import org.testng.annotations.Test;

public class StringManipulations {
	@Test(enabled=false)
	public static void reverstring(){
		String s="Divya";
		String t="";
		char[] c=s.toCharArray();
		for (int i=c.length-1;i>=0;i--){
		t=t+c[i];
					
			}
		System.out.println(t);
		}
	@Test(enabled=false)
	public static void reverstring1(){
		String s="Divya";
		String t="";
	
		for (int i=s.length()-1;i>=0;i--){
		t=t+s.charAt(i);
					
			}
		System.out.println(t);
		}
	@Test(enabled=false)
	public static void verifyPalidrom(){
		String s="madam";
		String t="";
		
		for (int i=s.length()-1;i>=0;i--){
		t=t+s.charAt(i);
					
			}
		System.out.println(t);
		if (s==t) {
			System.out.println("This is palindrome");
		}
	}
	@Test(enabled=false)
		public static void otherfunctions(){
			String s="Payment of $100";
			System.out.println("Substring of index 8 is "+s.substring(8));
			System.out.println("Character at index 8 is "+s.charAt(8));
			System.out.println("Index of character $ is "+s.indexOf("$"));
			
		}
	@Test
	public static void revereseSentence(){
		String sentence="Payment of $100";
		String[] word=sentence.split(" ");
		String reversesentence="";
		for (int i = word.length-1; i >=0; i--) {
			reversesentence=reversesentence+" "+word[i];
		}
		System.out.println(reversesentence);
		
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

