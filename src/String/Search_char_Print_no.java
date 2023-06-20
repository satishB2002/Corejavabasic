//9.enter a string by user and search particular character and print its no

package String;
import java.util.*;
public class Search_char_Print_no {
	static char el;
	static int c;
	 static boolean d= true;
	static String Str;
    static Scanner sc=new Scanner(System.in);
	public static   void input()
	{
		System.out.println("Enter Your String");
    String Str=sc.nextLine();
    System.out.println("Enter Chrecter to search");
    el=sc.next().charAt(0);
    
    for(int i=0;i<Str.length();i++)
		{
    	if(Str.charAt(i)==el)
    	{
    		c++;
    		d=true;
    		System.out.println("Index="+i);
    	}
    	
		}
    if(d)
    	System.out.println("Cherecter Found "+c+" Times");
    else
    	System.out.println("Cherecter not found");
   
    	
		
	}
	
    
	
	public static void main(String arg[])
	{
		
	    input();
		
	}
}
