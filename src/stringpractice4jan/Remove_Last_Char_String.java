//Q15.Wap enter a string and and remove last character and print final string.
package stringpractice4jan;
import java.util.*;
public class Remove_Last_Char_String {
static String Str;
static int i,j;
static Scanner sc=new Scanner(System.in);
public static void input()
{
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	for(i=0;i<Str.length()-1;i++)
	{
		System.out.println(Str.charAt(i));
	}
	
}
public static void main(String arg[])
{
	input();
	}

}
