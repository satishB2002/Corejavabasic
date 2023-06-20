//Q16.Wap enter a string and print substring of any given range.
package stringpractice4jan;
import java.util.*;
public class Substring_method {
static String Str;
static int i,j;
static Scanner sc=new Scanner(System.in);
public static void input()
{
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	String S1=Str.substring(0,6);
	System.out.println("The substring is="+S1);
}
public static void main(String arg[])
{
	input();
	}

}
