package String;

import java.util.Scanner;

/*Q3.
Write a Java program to add a string with specific number of times separated by a substring.
Sample Output:

The given strings are: try  and  best
Number to times to be repeat: 3
The new string is: trybesttrybesttry*/
public class Exq {
	Scanner sc=new Scanner(System.in);
public void input() {
	int k;
	System.out.println("Number to times to be repeat:");
	k=sc.nextInt();
	String s="try  and  best";
	String []S1=s.split(" ");
	char a[]=s.toCharArray();
	for (int i = 1; i <=k; i++) {
		System.out.print(S1[0]+S1[1]+S1[S1.length-1]);
		

}
}

public static void main(String[] args) {
	 Exq ss=new  Exq();
	 ss.input();
}
}
