//1.enter a string by user and search particular element are present or not

package stringpractice4jan;
import java.util.*;
public class Search_Perti_Element_Presernt_Or_not {
	static int i,j,c=0;
	static String Str;
	static Scanner sc=new Scanner(System.in);
	static char ele;
public static void input()
{
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	System.out.println("Enter You Want Search Elment");
	ele=sc.next().charAt(0);
	for(i=0;i<Str.length();i++)
	{
		if(Str.charAt(i)==ele)
		
			c=1;
		
	}
	if(c==1)
	{
		System.out.println("Element Found");
	}
	else
		System.out.println("Element Not Found");
	
}
public static void main(String arg[])
{
	input();
}

}
