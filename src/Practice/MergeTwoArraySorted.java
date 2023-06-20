package Practice;

import java.util.Scanner;

/*Q7.Write a Java program or function which takes two sorted integer 
  arrays as input and merge them in sorted order. 
 
For example, If arrayA = {-7, 12, 17, 29, 41, 56, 79} and arrayB 
= {-9, -3, 0, 5, 19} are two sorted integer
arrays then mergedArray must be
 {-9, -7, -3, 0, 5, 12, 17, 19, 29, 41, 56, 79}. Note that
  mergedArray is also sorted.*/

public class MergeTwoArraySorted {
	Scanner sc=new Scanner(System.in);
	int t;
public void name() {
	int a[]=new int[7];
	int b[]=new int[7];
	int size=a.length+b.length;
	int c[]=new int[size];
	System.out.println("Enter First Array");
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("Enter Second  Array");
	for (int i = 0; i < b.length; i++) {
		b[i]=sc.nextInt();
	}
	
	for (int i = 0; i < a.length; i++) {
		c[i]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
	
		c[a.length+i]=b[i];
	}
	for (int i = 0; i < c.length; i++) {
		for (int j = i+1; j < c.length; j++) {
			if(c[i]>c[j])
			{
				t=c[i];
				c[i]=c[j];
				c[j]=t;
			}
		}
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
}
public static void main(String[] args) {
	MergeTwoArraySorted  ss=new MergeTwoArraySorted ();
	ss.name();
}
}
