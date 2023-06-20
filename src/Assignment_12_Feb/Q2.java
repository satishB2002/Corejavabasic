package Assignment_12_Feb;

import Interface.interface1;

/*
Q2.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e.
the element that occurs more than once and whose index of the first occurrence is the smallest. 
*/
public class Q2 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,2,8};
	int c=0,count=0,t=0;
	for (int i = 0; i < a.length; i++) {
		c=0;
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j])
			{
				c++;
				System.out.println("Repeted ele="+a[i]);
				i=a.length;j=a.length-1;
			}
			
		}
	}
		
	}
	
}

