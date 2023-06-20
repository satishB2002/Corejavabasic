//6.Write a Java program to concatenate two strings
package stringpractice4jan;
import java.util.*;
public class concatenate_two_strings {
	static String Str;
	static int i,j;
	static String Str1;
	static Scanner sc=new Scanner(System.in);
	public static void input()
	{
		System.out.println("Enter Your First String ");
		Str=sc.nextLine();
		System.out.println("Enter Your Second  String ");
		Str1=sc.nextLine();
		System.out.println(Str.concat(Str1));
	}
	public static void main(String arg[])
	{
		input();
	}

}
