//8.Wap enter a string and the character present at even and odd position individually.

package stringpractice4jan;
import java.util.*;
public class Odd_Even_individually {
	static String Str;
	static int i,j;
	static Scanner sc=new Scanner(System.in);
	public static void input()
	{
		System.out.println("Enter Your String ");
		Str=sc.nextLine();
		System.out.println("Even Position");
		for(i=1;i<Str.length();i=i+2)
		{
			System.out.println(Str.charAt(i));
		}
		System.out.println("Odd Position");
		for(i=0;i<Str.length();i=i+2)
		{
			System.out.println(Str.charAt(i));
		}
	}
	public static void main(String arg[])
	{
		input();
	}
	

}
