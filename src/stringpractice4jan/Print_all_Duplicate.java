//Q21. Wap enter a string and print all duplicate character.

package stringpractice4jan;
import java.util.*;
public class Print_all_Duplicate {
	static String Str;
	static int i,j;
static Scanner sc=new Scanner(System.in);
public static void input()
{
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	System.out.println("Your Duplicate Element");
	for(i=0;i<Str.length();i++)
	{
		
		for(j=i+1;j<Str.length();j++)
		{
			if(Str.charAt(i)==Str.charAt(j))
			{
				System.out.print(Str.charAt(i));
			}
		}
	}
	
}
public static void main(String arg[])
          {
	input();

		 }

}
