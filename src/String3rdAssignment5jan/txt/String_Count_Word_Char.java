//Q2.Wap enter a string and find the count of word and character(excluding space).
package String3rdAssignment5jan.txt;
import java.util.*;
public class String_Count_Word_Char {
	String Str;
	int i,c1=0,c2=0,k;
	Scanner sc=new Scanner(System.in);
	
public void input()
{
	System.out.println("Enter String");
	Str=sc.nextLine();
	char c[]=Str.toCharArray();
	for(i=0;i<c.length;i++)
	{
		if(c[i]!=' ')
			c1++;
	}
	System.out.println("Count of char="+c1);
	String p[]=Str.split(" ");
	for(i=0;i<p.length;i++)
	{
		c2++;
	}
	System.out.println("Count of Words="+c2);
	
}
public static void main(String arg[])
{
	String_Count_Word_Char ss=new String_Count_Word_Char();	
	ss.input();
}
}
