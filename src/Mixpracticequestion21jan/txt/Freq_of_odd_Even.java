package Mixpracticequestion21jan.txt;

import java.util.Scanner;

/*WAP to Find the Frequency of Odd and Even Numbers in Matrix.

Enter number of rows in matrix:3
Enter number of columns in matrix:3
Enter all the elements of matrix:
1
2
3
4
5
6
7
8
9
Given Matrix:
1 2 3 
4 5 6 
7 8 9 
Even number frequency:4
Odd number frequency:5*/

public class Freq_of_odd_Even {
	
	Scanner sc=new Scanner(System.in);
public void name() {
	int i,j,m,n;
	
	System.out.println("Enter number of rows in matrix:");
	m=sc.nextInt();
	System.out.println("Enter number of Col in matrix:");
	n=sc.nextInt();
	System.out.println("Enter all the elements of matrix:");
	int a[][]=new int[m][n];
	for ( i = 0; i < a.length; i++) {
		for ( j = 0; j < a.length; j++) 
		{
			a[i][j]=sc.nextInt();
		}
	}
	for ( i = 0; i < a.length; i++) {
		for ( j = 0; j < a.length; j++) 
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	int c=0,k=0;
	
	for ( i = 0; i < a.length; i++) {
		for ( j = 0; j < a.length; j++) 
		{
			if(a[i][j]%2==0)
			{
				c++;
			}
			else if(a[i][j]%2!=0)
			{
				k++;
			}
		}
	}
	System.out.println("Even number frequency:"+c);
	System.out.println("Odd number frequency:"+k);
}
public static void main(String[] args) {
	Freq_of_odd_Even ss=new Freq_of_odd_Even();
	ss.name();
}
}
