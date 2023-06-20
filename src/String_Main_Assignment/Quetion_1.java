/*1. Write a Java program to get the character at the given index within the String. Go to the editor
Sample Output:
Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i 
Click me to see the solution*/
package String_Main_Assignment;

import java.util.Scanner;

public class Quetion_1 {
	int i,j;
	String Str="Java Exercises!";
	Scanner sc=new Scanner(System.in);
	public void input() {
		
		char []a=Str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
System.out.println("The Character at position 0="+a[0]);
System.out.println("The Character at position 10="+a[10]);
			
	}
	
public static void main(String[] args)
{
	
	Quetion_1 ss=new Quetion_1();
	ss.input();
}
}
