/*5. Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions. Go to the editor

Sample Output:

String 1: This is Exercise 1                                                                                  
String 2: This is Exercise 2                                                                                  
"This is Exercise 1" is less than "This is Exercise 2" 
Click me to see the solution*/
package String_Main_Assignment;

public class Quetion_5 {
	String Str1="Codenera";
	String Str2=new String("odeCnera");
	
	public void input() {
		System.out.println(Str1.compareTo(Str2));
		
		
	}
	public static void main(String[] args) {
		Quetion_5  ss=new Quetion_5 ();
		ss.input();
	}

}
