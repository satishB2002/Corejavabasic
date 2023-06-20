package Practice;

import java.util.Arrays;

public class Half_accen_Half_deccen {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	int t;
	int n=a.length;
	Arrays.sort(a);
	for (int i =n-6; i >=n/2; i--) {
		System.out.println(a[i]+" ");
	}
	for (int j =n/2; j <n; j++) {
		System.out.println(a[j]+" ");
	}
}
}
		
	
	
	