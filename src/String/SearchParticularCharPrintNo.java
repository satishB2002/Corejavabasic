package String;

import java.util.Scanner;

//9.enter a string by user and search particular character and print its no
public class SearchParticularCharPrintNo {
	Scanner sc=new Scanner(System.in);
public void name() {
	String Str;
	char k;
	System.out.println("Enter Your String ");
	Str=sc.nextLine();
	char []a=Str.toCharArray();
	System.out.println("Enter You Want Search Char");
	k=sc.next().charAt(0);
	System.out.println("Your Char is There No=");
	for (int i = 0; i < a.length; i++) {
		if(a[i]==k)
		{
			System.out.print(i);
		}
	}
	
}
public static void main(String[] args) {
	SearchParticularCharPrintNo aa=new SearchParticularCharPrintNo();
	aa.name();
}
}
