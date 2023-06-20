//4.enter a string by user and search particular character and print its no
package String;
import java.util.*;

public class Search_Perticular_Char_Print_no {
	static int i,j;
static String Str;
static char ch;
static int c=0;
static boolean t;
static Scanner sc=new Scanner(System.in);
public static void input()
{
	System.out.println("Enter Your String");
	Str=sc.nextLine();
	System.out.println("Enter You Want Search Character ");
	ch=sc.next().charAt(0);
	for(i=0;i<Str.length();i++)
	{
		if(Str.charAt(i)==ch)
		{
		t=true;
		c++;
		System.out.println("Index ="+i);
		
	    }
	}

	if(t)
	{
		System.out.println("Element Are Found "+c+" no of element" );
		
	}
	else 
		System.out.println("Element Are Found ");
	
}
public static void main(String arg[])
{
	 input();
}

}
