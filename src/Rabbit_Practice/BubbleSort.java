package Rabbit_Practice;

import String.intern_method;

public class BubbleSort {
public static void main(String[] args) {
	int a[]= {88,99,36,14,25,16,37,754,24};
	int	t;
	for (int i = 0; i < a.length; i++)
	{
		for (int j = i+1; j < a.length; j++) 
		{
			if (a[i]>a[j]) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			 }
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
