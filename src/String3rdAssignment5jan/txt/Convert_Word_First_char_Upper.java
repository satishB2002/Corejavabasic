//Q5.Wap enter a string in lowercase now you have to convert every first character of the word in upper case. 
package String3rdAssignment5jan.txt;
import java.io.Serializable;
import java.util.*;
public class Convert_Word_First_char_Upper {
	String Str="satish barate pune";
	Scanner sc=new Scanner(System.in);
	int i;
	Convert_Word_First_char_Upper ()
	{
		String a[]=Str.split(" ");
		for( i=0;i<a.length;i++)
		{
			String c=a[i].toUpperCase ();
			for(i=0;i<c.length();i++)
			{
				System.out.print(c.charAt(i)+" ");
			}
			
		}
		
	}
	public static void main(String arg[])
	{
		Convert_Word_First_char_Upper  ss=new Convert_Word_First_char_Upper ();
	}
}
