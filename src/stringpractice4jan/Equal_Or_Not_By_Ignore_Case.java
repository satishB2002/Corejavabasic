//7.Write a Java program to compare two strings using equalignore case.

package stringpractice4jan;
import java.util.*;
public class Equal_Or_Not_By_Ignore_Case {
	static int i,j;
	static String Str;
	static String Str1;
	static Scanner sc=new Scanner(System.in);
	public static int  input()
	{
		System.out.println("Enter Your First String ");
		Str=sc.nextLine();
		
		System.out.println("Enter Your First String ");
		Str1=sc.nextLine();
		if(Str.compareToIgnoreCase(Str1)==0)
		
			return 0;
		else
			return 1;
		
		
	
		
	}
	public static void main(String arg[])
	{
		
		Equal_Or_Not_By_Ignore_Case  ss=new Equal_Or_Not_By_Ignore_Case ();
		if(ss.input()==0)
		{
			System.out.println("String are Equal");
		}
		else
		{
			System.out.println("String Are Not Equal");
		}
	}
	
	

}
