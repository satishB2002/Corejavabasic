package Exception;

import java.util.Scanner;

public class Calculator {
int a,b;
Scanner sc=new Scanner(System.in);
public void disp() {
	System.out.println("Enter First no");
	a=sc.nextInt();
	System.out.println("Enter Second  no");
	b=sc.nextInt();
	System.out.println("=========Claculator============");
	System.out.println("Addition="+(a+b));
	System.out.println("Substaction="+(a-b));
	System.out.println("Multiplication="+(a*b));
	
	try {
		System.out.println("Division="+(a/b));
	} catch (Exception e) {
		System.out.println("Not allow Divisible By Zero");
	}
}
public static void main(String[] args) {
	Calculator  ss=new Calculator ();
	ss.disp();
}
}
