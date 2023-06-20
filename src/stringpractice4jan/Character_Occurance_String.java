//Q19.Write a Java program to find first occurrence of a character in a given string.

package stringpractice4jan;
import java.util.*;
public class Character_Occurance_String {
static String Str;
static int i,j;
static Scanner sc=new Scanner(System.in);
public static void input()
{
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	String []ss=Str.split(" ");
	for(i=0;i<ss.length;i++)
	{
		
	}
	System.out.println("First Occurance Are");
	System.out.println(ss[0]);
	
}
public static void main(String arg[])
{
	input();
}
}
