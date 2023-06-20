package String;

import java.util.Scanner;

//Q9.Wap enter a string and print substring of any given range.
public class SubstringOfGivenRange {
	Scanner sc=new Scanner(System.in);
public void name() {
	int k,l;
	String Str;
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	System.out.println("Enter Your Range To Start");
	k=sc.nextInt();
	System.out.println("Enter Your Range To Last");
	l=sc.nextInt();
	
	
	System.out.println(Str.substring(k,l));
}
public static void main(String[] args) {
	SubstringOfGivenRange dd=new SubstringOfGivenRange();
	dd.name();
	
}
}
