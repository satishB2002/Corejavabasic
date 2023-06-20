package String;

import java.util.Scanner;

import java.util.*;
public class Search_perticular_Char {
	

	public static boolean input(String str)
	{
		Scanner sc=new Scanner(System.in);
		String Ab;
		System.out.println("ENter Char to Search=");
		Ab=sc.nextLine();
		if(str.contains(Ab))
			return true;
		else
			return false;
		
	}
	public static void main(String arg[])
	{
		String str;
		 if(input("Ab the last value "))
             System.out.println(" Characters found");
         else
             System.out.println(" Characters  not  found");
	}

}
