package Practice_Most;

import java.util.Scanner;

import String.intern_method;

public class Anticlockwise_Left_Rotetion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How much rotation do you want");
	int n=sc.nextInt();
	int a[]= {1,2,3,4,5};
	for (int k = 1; k <=n; k++) {
		
	System.out.println("Rotation="+k);
	int x=a[a.length-1];
	
	for (int i=a.length-2;i>=0;i--) {
		a[i+1]=a[i];
	}
			a[0]=x;
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	
	}
	System.out.println();
	}
}
}
