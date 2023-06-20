//Q8.Wap enter a string and print first most repeating character using class and object.
package String3rdAssignment5jan.txt;
import java.util.*;
public class First_non_repeating_char {
	String Str;
	int i,j,count,max=0,freq=0;
	Scanner sc=new Scanner(System.in);
	First_non_repeating_char ()
	{
		System.out.println("Enter Your String" );
		Str=sc.nextLine();
	
		char []a=Str.toCharArray();
			
		
		for(i=0;i<a.length;i++)
		{
			count=1;
			for(j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				
					count++;
				
				
			
			if(count>max)
			{
				max=count;
				freq=a[i];
			}
			}
		}
		System.out.println("Most repeted element is="+(char)freq);
		
	}
	public static void main(String arg[])
	{
		First_non_repeating_char  ss=new First_non_repeating_char ();
	}

}
