//8.Wap enter a string and print the character present at odd position.
package String;
import java.util.*;
public class Odd_pos_String {
	static String Str;
    static Scanner sc=new Scanner(System.in);
	public static   void input()
	{
		System.out.println("Enter Your String");
    String Str=sc.nextLine();
        for(int i=0;i<Str.length();i=i+2)
		{
    
    System.out.println(Str.charAt(i));	
    		
		}
	}
	public static void main(String arg[])
	{
		
	    input();
		
	}
}

