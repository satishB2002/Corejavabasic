 //6.enter a string by user and search particular element are present or not
package Stringpreviouspractice.txt_13_01;

import java.util.Scanner;

public class Quetion_6 {
	static Scanner sc=new Scanner(System.in);
	static 
	{
		int i,j,c;
		String Str;
		boolean t=false; 
		System.out.println("Enter Your String");
		Str=sc.nextLine();
		
		
		System.out.println("Enter Your Search Character ");
		char ele=sc.next().charAt(0);
		c=0;
		for(i=0;i<Str.length();i++)
		{
			if(Str.charAt(i)==ele)
			{
				t=true;
			}
			
		}
		if(t)
		{
			System.out.println("Character Are Present");
		}
		else 
			System.out.println("Character Are Not  Present");
		
		
	}
public static void main(String[] args) {
	
}
}
