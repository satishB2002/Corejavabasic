package Practice;

import java.util.Iterator;

import Interface.interface1;

public class Merge_array {
public static void main(String[] args) {
	int i,j;
	int l=0,m=1;
	int a[]= {1,2,3,4,5};
	int b[]= {5,4,3,2,1};
	int c[]=new int[a.length+b.length] ;
	
	for ( i = 0; i < a.length; i++) {
		c[l]=a[i];
		l=l+2;
	}
	for ( i = 0; i < b.length; i++) {
		c[m]=b[i];
		m=m+2;
	}
	for ( i = 0; i < c.length; i++) {
		System.out.println(c[i]+" ");
	}
}
}
