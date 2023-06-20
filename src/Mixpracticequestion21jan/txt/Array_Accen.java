package Mixpracticequestion21jan.txt;

import java.util.Iterator;

/*Q1.Given an array arr[] of size N, the task is to sort this array in ascending order in C.
Examples: 

Input: arr[] = {0, 23, 14, 12, 9}
Output: {0, 9, 12, 14, 23}

Input: arr[] = {7, 0, 2}
Output: {0, 2, 7}
*/
public class Array_Accen {
public void name() {
	int i,j,t;
	int a[]= {0, 23, 14, 12, 9};
	for ( i = 0; i < a.length; i++) {
		for ( j = i+1; j < a.length; j++) {
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		
	}
	for ( i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}	
	
}
public static void main(String[] args) {
	Array_Accen ss=new Array_Accen();
	ss.name();
	
}
}
