//Q14.Wap enter a string and find the occurence of first word, first character, last word, last character in string by using class and object.
package String3rdAssignment5jan.txt;
import java.util.*;
public class Occurance_F_C_F_W_L_C_W {
	
	int i,j;
	Scanner sc=new Scanner(System.in);
	Occurance_F_C_F_W_L_C_W ()
	{
	System.out.println("Enter Your String");
		String Str=sc.nextLine();
	
		String  []a=Str.split(" " );
		for(i=0;i<a.length;i++)
		{
			
		}
		System.out.println(a[0]);
		System.out.println(a[0].charAt(0));
		System.out.println(a[a.length-1]);
		String b[]=Str.split(" ");
		for(i=0;i<b.length;i++)
		{
			
		}
		System.out.println(b[b.length-1]);

	}
	public static void main(String arg[])
	{
		Occurance_F_C_F_W_L_C_W  ss=new Occurance_F_C_F_W_L_C_W ();
	}

}
