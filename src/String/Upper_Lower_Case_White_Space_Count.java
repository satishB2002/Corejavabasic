/*11.Wap enter a stringa ns find the count of:
  upper case
  lower case
  white space*/
package String;
import java.util.*;
public class Upper_Lower_Case_White_Space_Count {
String Abc;
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter String ");
	Abc=sc.nextLine();
	int a=0,b=0,c=0,d=0;
	for(int i=0;i<Abc.length();i++)
	{
		if(Abc.charAt(i)>='a'&&Abc.charAt(i)<='z')
		{
			a++;
		}
		else if(Abc.charAt(i)>='A'&&Abc.charAt(i)<='Z')
		{
			b++;
		}
		else if(Abc.charAt(i)>=' ')
		{
			c++;
		}
		else
		{
			d++;
		}
	}
	System.out.println("Lower Case Count="+a);
	System.out.println("Upper Case Count="+b);
	System.out.println(" White Space Count="+c);
	System.out.println("Special Character  Count="+d);
	
}
public static void main(String arg[])
{
	Upper_Lower_Case_White_Space_Count ob =new Upper_Lower_Case_White_Space_Count();
	ob.input();
	}
}
