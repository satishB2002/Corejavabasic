package Rabbit_Practice;

import String.intern_method;

public class N_PrimeNumber {
public static void main(String[] args) {
	int n=5;
	int	c,i,j,k=2;

	for ( i =1; i <=n; k++) {
		c=0;
		for ( j = 2; j <k; j++) {
			if (k%j==0) 
			c++;
		}
		if (c==0) {
			System.out.println(k);
			i++;
		}
		
	}
}
}
