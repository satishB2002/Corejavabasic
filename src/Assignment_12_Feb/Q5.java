package Assignment_12_Feb;

import Interface.interface1;

/*
Q5.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples: 
 

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9
*/
public class Q5 {
public static void main(String[] args) {
	int a[]={12, 3, 4, 1, 6, 9};
	int sum=24;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			for (int j2 = j+1; j2 < a.length; j2++) {
				if(a[i]+a[j]+a[j2]==sum)
				{
				System.out.println(a[i]+" "+a[j]+" "+a[j2]);
				}
			
			
			}
		}
	}
}
}