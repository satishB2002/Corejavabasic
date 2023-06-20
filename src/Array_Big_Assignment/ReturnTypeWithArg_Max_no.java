//Q6. Write a Java program to find max number in an array.
package Array_Big_Assignment;

import java.util.Iterator;

public class ReturnTypeWithArg_Max_no {
	int t=0;
public int  input(int a[]) {
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		
		if(a[i]>a[j]) 
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
			
		}
	}
	
}
System.out.println("Max no is="+a[a.length-1]);
	return 0;
	
}
public static void main(String[] args) {
	int a[]= {57,69,35,2,4,17,63,};
	ReturnTypeWithArg_Max_no ss=new ReturnTypeWithArg_Max_no();
	ss.input(a);
}
}
