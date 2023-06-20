/*Q9. Write a Java program to create a new string from a given string swapping the last two 
characters of the given string. The length of the given string must be two or more.
Sample Output:
The given strings is: string 
The string after swap last two characters are: strign*/
package String3rdAssignment5jan.txt;
import java.util.*;
public class Swap_String {
	String Str;
	Scanner sc=new Scanner(System.in);
	String x;
	int i,j;
	Swap_String ()
	{
		
		System.out.println("Enter Your String ");
		String Str=sc.nextLine();
		String Str1=Str.substring(0,4);
		String Str2=Str.substring(4);
		char []a= new char[Str.length()];
		char []aa=Str2.toCharArray();
		int l=0;
		for(i=aa.length-1;i>=0;i--)
		{
			a[l]=aa[i];
			l++;
		}
		String kk=String.copyValueOf(a);
		//System.out.println(kk);
		String mm=Str1.concat(kk);
		System.out.println(mm);

		
		
	}
    public static void main(String arg[])
    {
    	Swap_String ss=new Swap_String();
    	
    }
}
