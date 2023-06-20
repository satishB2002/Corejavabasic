 // 7.Wap enter a string and print the character present at even position.
package Stringpreviouspractice.txt_13_01;

import java.util.Scanner;

public class Quetion_7 {
	static Scanner sc=new Scanner(System.in);
	static 
	{
		int i,j;
		
		String Str;
		System.out.println("Enter Your String");
		Str=sc.nextLine();
		char a[]=Str.toCharArray();
		for(i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
		
		
	}
	public static void main(String[] args) {
		
	}

}
