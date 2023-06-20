package Rabbit_Practice;

import java.util.Scanner;

import String.intern_method;

public class PrintNth_Ele {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter Array Element");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();	
			}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}

	System.out.println("Enter The Element You Want Say");
	int	n=sc.nextInt();
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[n-1]);
		break;
	
	}
}
}

