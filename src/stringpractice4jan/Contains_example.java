package stringpractice4jan;
import java.util.*;
public class Contains_example {
	static int i,j;
	static String Str;
	static Scanner sc=new Scanner(System.in);
	public static boolean input(String Str1)
	{
		System.out.println("Enter Your String ");
		Str=sc.nextLine();
		if(Str1.contains(Str))
		
			return true;
		else
			return false;
	}
	public static void main(String arg[])
	{
		if(input("Satish Barate Waghapur"))
			System.out.println("Character Are Found");
		else
		System.out.println("Character  Are Not  Found");
		
	}

}
