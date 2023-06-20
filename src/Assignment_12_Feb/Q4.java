package Assignment_12_Feb;
/*Q4.Given an array of N integers, and a number sum, the task is to find the number of pairs of integers 
in the array whose sum is equal to sum.

Examples:  

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2*/

import Interface.interface1;

public class Q4 {
public static void main(String[] args) {
	int a[]= {1,5,7,-1};
	int c=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if((a[i]+a[j])==6)
			{
				c++;
			}
		}
		
	}
	System.out.println("Pairs of sum="+c);
}
}
