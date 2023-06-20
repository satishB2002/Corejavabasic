//Q13.Write a Java program to find reverse of a string using class and object.
package stringpractice4jan;
import java.util.*;
public class Reverse_String {
	static String Str;
	static int i,j;
	static Scanner sc=new Scanner(System.in);
	public static void input()
	{
		System.out.println("Enter Your String ");
		Str=sc.nextLine();
		for(i=Str.length()-1;i>=0;i--)
		{
		System.out.println(Str.charAt(i));	
		}
		
		
	}
public static void main(String arg[])
{
	input();
}
}
