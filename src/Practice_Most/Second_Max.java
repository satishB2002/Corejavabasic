package Practice_Most;

import String.intern_method;

public class Second_Max {
public static void main(String[] args) {
	int	a[]= {56,12,35,74,99,85,62,11};
	int max=a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>max) {
			max=a[i];
			
		} 
	}
	System.out.println("Max Element Array="+max);
	int max1=a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>max1 && a[i]!=max) {
			max1=a[i];
			
		}   
	}
	System.out.println(" Second Max Element Array="+max1);
}
}
