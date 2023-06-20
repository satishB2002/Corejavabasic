package Assignment_12_Feb;

import Interface.interface1;

/*Q.3 Find the majority element in the array. A majority element in an array A[] of size n is an element 
that appears more than n/2 times (and hence there is at most one such element). 

Examples : 

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}

Output : 4*/
public class Q3 {
public static void main(String[] args) {
	int a[]= {3,3,4,2,4,4,2,4,4};
	int n=a.length;
	int c=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]== a[j])
			{
				c++;
			}
		}
				if(c>=n/2)
				{
					System.out.println(a[i]+" ");
					break;
				}
			
			
		
	}
}
}
