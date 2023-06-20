//Q14.Wap enter a string and and remove first character and print final string.
package stringpractice4jan;
import java.util.*;
public class Remove_First_Char {
	static String Str;
	static int i,j;
	static Scanner sc=new Scanner(System.in);
	public static void input()
	{
		System.out.println("Enter YOur String");
		Str=sc.nextLine();
		System.out.println("First char Remove THen String ");
		for(i=1;i<Str.length();i++)
		{
			System.out.println(Str.charAt(i));
		}
	}
	public static void main(String arg[])
	{
		input();
		}

}
