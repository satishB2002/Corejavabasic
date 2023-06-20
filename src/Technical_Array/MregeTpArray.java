package Technical_Array;

import java.util.Iterator;

//Q12.Java Program to Merge Two Arrays

public class MregeTpArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	int b[]= {9,10,11,22,33,58,69};
	int c[]= new int[a.length+b.length];
	for (int i = 0; i < b.length; i++) {
		c[i]=a[i];
	}
	for (int i = 0; i < b.length; i++) {
		c[b.length+i]=b[i];
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
}
}
