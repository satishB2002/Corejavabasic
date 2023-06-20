package Practice;

import String.intern_method;

public class break_ {
public static void main(String[] args) {
	int n=123457478;
	int rem;
	int t=n;
	while (t!=0) {
		rem=t%10;
		System.out.print(rem);
		t=t/10;
	}
}
}
