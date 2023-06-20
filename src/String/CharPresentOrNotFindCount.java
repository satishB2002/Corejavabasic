package String;

import java.util.Scanner;

/*15.enter a string by user and search particular character are present or not if present find count
using class and object.*/
public class CharPresentOrNotFindCount {
	Scanner sc=new Scanner(System.in);
public void name() {
	String Str="Akolkke";
	char []a=Str.toCharArray();
	char h;
	System.out.println("Enter Your Character");
	h=sc.next().charAt(0);
	int c=0;
	int k=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==h)
		{
			k++;
			c++;
			
		}
	}
		if(c==1)
		{
			System.out.println("Character Are Found");
		}
		else
			System.out.println("Character Are Found");
	
	
	System.out.println("Character is Found="+k);
	
}
public static void main(String[] args) {
	CharPresentOrNotFindCount  ss=new CharPresentOrNotFindCount ();
	ss.name();
	
}
}
