/*7. Write a Java program to concatenate a given string to the end of another string. Go to the editor

Sample Output:

String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises
Click me to see the solution*/
package String_Main_Assignment;

public class Quetion_7 {
	String Str;
	String Str2;
	public void input() {
		String Str="PHP Exercises and ";
		String Str2=new String("Python Exercises ");
		System.out.println(Str.concat(Str2));
		
	}
public static void main(String[] args) {
	Quetion_7 ss=new Quetion_7();
	ss.input();
}
}
