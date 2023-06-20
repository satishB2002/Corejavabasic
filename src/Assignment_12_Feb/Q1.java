package Assignment_12_Feb;
/*Q1.Given an array and a number K where K is smaller than the size of the array. 
Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7*/

import java.util.Arrays;

import Interface.interface1;

public class Q1 {
public static void main(String[] args) {
	int a[]= {7, 10, 4, 3, 20, 15};
	int k=3;
	for (int i = 0; i < a.length; i++) {
		Arrays.sort(a);
	}
	System.out.println(a[k-1]+" ");
}
}
