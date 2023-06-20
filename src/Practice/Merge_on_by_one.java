package Practice;

import String.intern_method;

public class Merge_on_by_one {
public static void main(String[] args) {
	int a=100;
	int rem;
	int i,j;
	for ( i = 1; i <=a; i++) {
		if(a%i==0)
		{
			for ( j = 2; j <i; j++) {
				if(i%j==0)
					break;
			}
			if (i==j) {
				System.out.println(i);
				
			}
		}
	}
	
}
}
