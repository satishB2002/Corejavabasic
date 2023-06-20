//5.enter a string by user and print it in verticle form
package Stringpreviouspractice.txt_13_01;

import java.util.Scanner;

public class Quetion_5 {
	static Scanner sc=new Scanner(System.in);
	static 
	{
		String Str;
		int i;
		System.out.println("Enter Your String");
		Str=sc.nextLine();
		char a[]=Str.toCharArray();
		for( i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	}
public static void main(String[] args) {
	
}
}
