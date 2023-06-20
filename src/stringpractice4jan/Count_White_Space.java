//Q20.Wap enter a string and find the count of white space.
package stringpractice4jan;
import java.util.*;

public class Count_White_Space {
	static String Str;
	static int i,j,c;
	static Scanner sc=new Scanner(System.in);
	public static void input()
	{
		System.out.println("Enter Your String ");
		Str=sc.nextLine();
		c=0;
		for(i=0;i<Str.length();i++)
		{
			if(Str.charAt(i)==' ')
				c++;
		}
		System.out.println("Count of Spaces="+c);
	}
	public static void main(String arg[])
	{
		input();
	}

}
