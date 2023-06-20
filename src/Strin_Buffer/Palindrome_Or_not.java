package Strin_Buffer;
//Q1.Write a  Java program to check String is Palindrome or not Using StringBuffe.

public class Palindrome_Or_not {
public void name() {
	String Str="aba";
	
	StringBuffer ss=new StringBuffer(Str);
	String s=ss.reverse().toString();
	
	if(s.equals(Str))
	{
		System.out.println("String Are Palindrome");
		
	}
	else 
		
		System.out.println("String Are not Palindrome");
}
public static void main(String[] args) {
	Palindrome_Or_not sd=new Palindrome_Or_not();
	sd.name();
}
}
