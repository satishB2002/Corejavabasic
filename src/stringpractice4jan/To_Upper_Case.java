//3.enter a string by user and convert it in upper case
package stringpractice4jan;
import java.util.*;
public class To_Upper_Case {
static String Str;
static int i,j;
static Scanner sc=new Scanner(System.in);
public static void input()
{
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	for(i=0;i<Str.length();i++)
	{
		
	}
	System.out.println(Str.toUpperCase());
}
public static void main(String arg[])
{
	input();
}
}
