//Q1.Wap enter a string and print it in a reverse order word by word.
package String3rdAssignment5jan.txt;
import java.util.*;
public class String_Reverse 
{
	 Scanner sc=new Scanner(System.in);
	 
 public  void input()
	{   
		
		System.out.println("Enter Your string");
		String s=sc.nextLine();
		
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String arg[])
	{
		String_Reverse  ss= new String_Reverse ();
		
		ss.input();
	}

}
