//2.enter a string by user and print it
package String;
import java.util.Scanner;
public class String_user_print {
	static String Str;
    static Scanner sc=new Scanner(System.in);
	public static   void input()
	{
		System.out.println("Enter Your String");
    String Str=sc.nextLine();
    
	
	
		
		for(int i=0;i<Str.length();i++)
		{
		System.out.println(Str.charAt(i));
		}
	}
    
	
	public static void main(String arg[])
	{
		
	    input();
		
	}
}
