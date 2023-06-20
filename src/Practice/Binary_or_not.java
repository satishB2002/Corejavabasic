package Practice;

import String.intern_method;

public class Binary_or_not {
public static void main(String[] args) {
	int a=10111;
	int t=a;
	int c=0;
	int rem;
		
		while (t!=0) {
		rem=t%10;
		t=t/10;
		c++;
		
		
		}
		if (c==1 && c==0 ) {
			System.out.println("Binary");
		} else {
			System.out.println("No Binary");
		}
}
}
