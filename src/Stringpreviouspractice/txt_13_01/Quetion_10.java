//10.enter a string and count the no of vowel and consonent.
package Stringpreviouspractice.txt_13_01;

import java.util.Scanner;

public class Quetion_10 {
	static Scanner sc=new Scanner(System.in);
static 
{
	String Str;
	int i,j,c,k;
	
	System.out.println("Enter String ");
	Str=sc.nextLine();
	char a[]=Str.toCharArray();
	c=0;
	k=0;
	for(i=0;i<a.length;i++)
	{
		if(Str.charAt(i)=='a'||Str.charAt(i)=='e'||Str.charAt(i)=='i'||Str.charAt(i)=='o'||Str.charAt(i)=='u'||Str.charAt(i)=='A'||Str.charAt(i)=='E'||Str.charAt(i)=='I'||Str.charAt(i)=='O'||Str.charAt(i)=='U')
		{
			c++;
		}
		else
			k++;
	}
	System.out.println("Count Of Vowels="+c);
	System.out.println("Count Of Consonent="+k);
	
}
public static void main(String[] args) {
	
}
}
