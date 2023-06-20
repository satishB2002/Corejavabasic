//Q10. Write a Java program to read a given string and if the first or last characters are same 
//return the string without those characters otherwise return the string unchanged
package String3rdAssignment5jan.txt;
import java.util.*;
public class String_First_and_last_Are_same_print_those_char_other_unchanged {
	String Str;
	int i,j;
	Scanner sc=new Scanner(System.in);
	String_First_and_last_Are_same_print_those_char_other_unchanged ()
	{
		System.out.println("Enter Your String ");
		Str=sc.nextLine();
		char []a=Str.toCharArray();
		
		for(i=0;i<a.length;i++)
		{
			if(a[0]==a[a.length-1])
				for(i=1;i<a.length-1;i++)
				{
					System.out.println(a[i]);
				}
			else
				for(i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
				}
				
		}
		
	}
	public static void main(String arg[])
	{
	String_First_and_last_Are_same_print_those_char_other_unchanged ss=new String_First_and_last_Are_same_print_those_char_other_unchanged ();
		
	}
}
