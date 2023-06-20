package Assignment_12_Feb;
/*Q1.Write a Java program to replace first occurrence of a character with another in a string.
Ans:*/


public class Q12 {
public static void main(String[] args) {
	String Str="I Like My Country";
	System.out.println("First String"+Str);
    String res = Str.replaceFirst("Like", "Love");

	System.out.println("After The Replacing=="+res);
	
}
}
