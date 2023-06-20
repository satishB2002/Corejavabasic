package Arraydifficult;

import java.util.Scanner;

//WAP to iterator the array element using return type with argument method
public class Array_Return {
	Scanner sc=new Scanner(System.in);
	public   int[] aaray(int size )
	{
		int j[]=new int[size];
		System.out.println("Enter Array");
		for (int i = 0; i <size; i++) {
			 j[i]=sc.nextInt();
		}
		return j;
	}
public static void main(String[] args) {
	
	Array_Return ss=new Array_Return();
	
	int b[]=ss.aaray(5);
	for (int i = 0; i <b.length; i++) {
		System.out.println(b[i]+" ");
	}
}
}
