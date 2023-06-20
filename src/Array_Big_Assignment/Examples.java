package Array_Big_Assignment;

import java.util.Scanner;

public class Examples {
	int i,j;
	int a[]= {1,2,3,4,5,6,7};
	Scanner sc=new Scanner(System.in);
	public void Print_Array() {
		System.out.println("!!! Your Array!!!");
		for (i = 0; i < a.length; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
	public void Print_Reverse() {
		System.out.println("!!! Your Reverse Array!!!");
		for ( i = a.length-1; i >=0; i--) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
	public void Print_Search_Element() {
		int ele,c;
		
		System.out.println("Enter Element You Want Search Element");
		ele=sc.nextInt();
		c=0;
		for (i = 0; i < a.length; i++) {
			
				if(a[i]==ele)
				{
					c++;
				}
			}
		if(c==1)
			
			System.out.println("Element Are Found");
		
		else
			System.out.println("Element Are Not Found");
		
		}
			
		
		
	
	public void Print_Array_Delete_Element() {
		int ele;
		int pos;
		System.out.println("Enter Element You Want Delete");
		System.out.println("Enter position You Want Delete");
		for ( i = 0; i < a.length; i++) {
			
		}
	}
	public void Print_Array_Anticlockwise() {
		int x;
		x=a[0];
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i-1];
			
		}
		a[a.length-1]=x;
		for ( i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}
	public void Print_Array_Clockwise() {
		
	}
	public void Print_Array_Smallest_Element() {
		
	}
	public void Print_Array_Greatest_Element() {
		
	}
public static void main(String[] args) {
	Examples ss=new Examples ();
	ss.Print_Array();
	ss.Print_Reverse();
	ss.Print_Search_Element();
	ss.Print_Array_Delete_Element();
}
}
