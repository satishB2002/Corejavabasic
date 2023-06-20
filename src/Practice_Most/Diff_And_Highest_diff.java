package Practice_Most;

import String.intern_method;

public class Diff_And_Highest_diff {
public static void main(String[] args) {
	int a[]= {4,1,21,35,74,96};
	int c=0;
	for (int i = 0; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			if (a[i]<a[j]) {
				if (i+j==0) {
					c++;
				}
				System.out.println(a[j]);
				break;
			}	
	}
		System.out.println(c);
		
	
		
}
}
}
