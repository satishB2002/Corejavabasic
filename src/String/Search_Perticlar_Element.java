//6.enter a string by user and search particular element are present or not
package String;
import java.util.*;
public class Search_Perticlar_Element {
	static char ele='a';
	static int c;
	static String Str;
    static Scanner sc=new Scanner(System.in);
	public static   void input()
	{
		System.out.println("Enter Your String");
    String Str=sc.nextLine();
    c=0;
    for(int i=0;i<Str.length();i++)
		{
    	if(Str.charAt(i)==ele)
    		c=1;
    	
		
		}
    if(c==1)
    	System.out.println("Element Are Found");
    else
    System.out.println("Element Not  Found");
	}
    
	
	public static void main(String arg[])
	{
		
	    input();
		
	}
}

