package Practice;

import java.util.Arrays;


public class Sorted_Array {
public void name() {
	int i,j;
	int a[]= { 1, 5, 6, 7, 8, 10 };
	int b[]= { 2, 4, 9 };
	System.out.println("Orignal First Sorted Array");
	for ( i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Orignal Second Sorted Array");
	for ( i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	
	int c[]=new int[a.length+b.length];
	for ( i = 0; i < a.length; i++) {
		c[i]=a[i];
	}
	//System.out.println("Orignal Array");
	for ( i = 0; i < b.length; i++) {
		c[a.length+i]=b[i];
	}
	for ( i = 0; i < c.length; i++) {
		//System.out.println(c[i]);
	}
	//System.out.println("Sorted Arrays:");
	for (i = 0; i < c.length; i++) {
		Arrays.sort(c);
		//System.out.println(c[i]);
	}
	
	for ( i = 0; i < a.length; i++) {
		a[i]=c[i];
		
	}
	/*for ( i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}*/
	System.out.println();
	System.out.println("First Array");
	for ( i =0; i <a.length; i++) {
		a[i]=c[i];
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Second  Array");
	for ( i = 0; i < b.length; i++) {
		b[i]=c[a.length+i];
		System.out.print(b[i]+" ");
	}
	
	

	
}
public static void main(String[] args) {
	Sorted_Array ss=new Sorted_Array();
	ss.name();
}
}
