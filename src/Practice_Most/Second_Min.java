package Practice_Most;

import String.intern_method;

public class Second_Min {
public static void main(String[] args) {
	int a[]= {65,11,75,82,8,37,49,2,856};
	int min=a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]<min) {
			min=a[i];
			
		}
		
	}
	System.out.println("Array Element Min="+min);
	int min2=a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]<min2 && a[i]!=min) {
			min2=a[i];
			
		}
		
	}
	System.out.println("Array Element Min="+min2);
}
}
