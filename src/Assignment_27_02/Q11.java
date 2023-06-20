package Assignment_27_02;

import String.intern_method;

//10.Wap enter a string and print first non repeating character using class and object.
//Q11.a[]={10,20,30,40,50}
//   b[]={1,2,3,4,5}
//output array=c[]={10,5,20,4,30,3,40,2,50,1}
public class Q11 {
public static void main(String[] args) {
	int a[]={10,20,30,40,50};
	int b[]={1,2,3,4,5};
	int	size=a.length+b.length;
	int c[]=new int[size];
	int l=0;
	int m=1;
	for (int i = 0; i < a.length; i++) {
		c[l]=a[i];
		l=l+2;
	}
	for (int i =b.length-1; i >=0; i--) {
		c[m]=b[i];
		m=m+2;
		
	}
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+" ");
	}
}
}
