
//11.Wap enter a string and remove all duplicate character using class and object.

package stringpractice4jan;
import java.util.*;
public class Remove_Duplicate {
	static String  Str;
	static String  Str1;
	static int i,j;
	
static Scanner sc=new Scanner(System.in);
public static void input()
{
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	
	for(i=0;i<Str.length();i++)
	{
		
		for(j=i+1;j<Str.length();j++)
		{
			if(Str.charAt(i)==Str.charAt(j))
			{
			System.out.println(Str.charAt(i));
			}
		}
		
	}
	
}
public static void main(String arg[])
{
	input();
	}
}
