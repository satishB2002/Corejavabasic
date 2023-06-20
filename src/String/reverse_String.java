//14.Write a Java program to find reverse of a each character in a string.

package String;
import java.util.*;
public class reverse_String {
	static String Xyz;
	static Scanner sc=new Scanner(System.in);
	public static void input()
	{
		System.out.println("enter your String");
		Xyz=sc.nextLine();
		for(int i=Xyz.length()-1;i>=0;i--)
		{
			System.out.print(Xyz.charAt(i));
		}
		
	}
	public static void main(String arg[])
	{
		input();
	}

}
