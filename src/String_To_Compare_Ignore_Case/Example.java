package String_To_Compare_Ignore_Case;

import java.util.Scanner;

import String_To_Compare_Method.Greater_than;

public class Example {
	String s1;
	String s2;
	Scanner sc=new Scanner(System.in);
public int input()
{
	System.out.println("Enter Your First String");
	s1=sc.nextLine();
	System.out.println("Enter Your Second  String");
	s2=sc.nextLine();
	
	System.out.println(s1);
	System.out.println(s2);
	if(s1.compareToIgnoreCase(s2)==0)
	{
	   return 0;
	}
	else if(s1.compareToIgnoreCase(s2)>0)
	{
		return 1;
	}
	else if(s1.compareToIgnoreCase(s2)<0)
	{
		return -1;
	}
	
	return 0;
}
public static void main(String arg[])
{
	
	Greater_than ss=new Greater_than();
	
	if(ss.input()==0)
	{
		System.out.println("String Are Equal Compare To Ignore Case Method");
	}
	else if(ss.input()>0)
	{
		System.out.println("String S1 Are Greator");
	}
	else if(ss.input()<0)
	{
		System.out.println("String S1 Are Smaller");
	}
}
}


