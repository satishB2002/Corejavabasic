//3.enter a string by user and find its length
package String;
import java.util.*;
public class user_String_length {
	static Scanner sc=new Scanner(System.in);
	static String Dk;
	
	public static void Disp()
	{
		System.out.println("Enter String");
		Dk =sc.nextLine();
		 int size=Dk.length();
		for(int i=0;i<Dk.length();i++)
		{
		System.out.println(Dk.charAt(i));	
		}
		System.out.println("Length Of String="+size);
		
	}
	public static void main(String arg[])
	{
		Disp();
	}


}
