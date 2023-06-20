//Q4.Wap enter a string and sort each word of string in accending and decending order by the length of each word
package String3rdAssignment5jan.txt;
import java.util.*;
public class Sort_By_Word_length {
String Str="Nashik Ahmednagr The Pune ";

int i,j;
Scanner sc=new Scanner(System.in);
Sort_By_Word_length()
{
	String []a=Str.split(" ");
	System.out.println("Your String");
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	String t;
	System.out.println();
	System.out.println("In Accending Order======");
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i].length()>a[j].length())
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
			
		}
		
			System.out.println(a[i]+" ");
		
	}
	System.out.println("In Deccending Order======");
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i].length()<a[j].length())
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		System.out.println(a[i]+" ");
	}
	
}
public static void main(String arg[])
{
	Sort_By_Word_length ss=new Sort_By_Word_length();
}
}
