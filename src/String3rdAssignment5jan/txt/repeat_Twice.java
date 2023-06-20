/*
Q13. Write a Java program to create a new string repeating every character twice of a 
given string.
Sample Output:
The given string is: welcome
The new string is: wweellccoomme*/
package String3rdAssignment5jan.txt;
import java.util.*;
public class repeat_Twice {
	Scanner sc=new Scanner(System.in);
	repeat_Twice()
	{
		System.out.println("Enter Your String ");
		String Str=sc.nextLine();
		for(int i=0;i<Str.length();i++)
		{
			System.out.println(Str.charAt(i));
			System.out.println(Str.charAt(i));
		}
	}
	public static void main(String arg[])
	{
		repeat_Twice  ss=new repeat_Twice ();
	}
}
