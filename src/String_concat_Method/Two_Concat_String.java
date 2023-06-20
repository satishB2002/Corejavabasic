package String_concat_Method;

import java.util.Scanner;
public class Two_Concat_String {
	String s1;
	String s2;
	Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Your First String");
	s1=sc.nextLine();
	System.out.println("Enter Your Second  String");
	s2=sc.nextLine();
	System.out.print(s1.concat(s2));
}
public static void main(String arg[])
{
	
	Two_Concat_String ss=new Two_Concat_String() ;
	ss.input();
	
}
}


