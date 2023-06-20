//5.enter a string by user and print it in verticle form
package String;

import java.util.Scanner;

public class Vertical_Form {
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

