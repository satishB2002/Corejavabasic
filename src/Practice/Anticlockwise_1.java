package Practice;

import String.intern_method;

public class Anticlockwise_1 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int	x=a[0];
	for (int i = 1; i <a.length; i++) {
	    a[i-1]=a[i];
	}
	a[a.length-1]=x;
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	}
}
}
