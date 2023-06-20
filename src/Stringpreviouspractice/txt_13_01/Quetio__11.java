package Stringpreviouspractice.txt_13_01;

import java.util.Scanner;

public class Quetio__11 {
	static Scanner sc=new Scanner(System.in);
static
{
	System.out.println("Enter String ");
	String Abc=sc.nextLine();
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
public static void main(String[] args) {
	
}
}