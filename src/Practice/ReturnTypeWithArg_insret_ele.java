//Q7.Wap input an array now insert any element at any position ,
  //  element and position is taken by user.
package Practice;

import java.util.Scanner;

public class ReturnTypeWithArg_insret_ele {
public int input(int ele,int a[],int pos) {
	for (int i =a.length-1; i >= pos; i--) {
		a[i]=a[i-1];
	}
	a[pos]=ele;
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]+" ");
	}
	
	return 0;
}
public static void main(String[] args) {
	int ele,pos;
	int a[]= {1,2,3,4,5,6,7,8,9};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Element You Want Insert");
	ele=sc.nextInt();
	System.out.println("Enter Your Pos");
	pos=sc.nextInt();
	 ReturnTypeWithArg_insret_ele ss=new  ReturnTypeWithArg_insret_ele ();
	 ss.input(ele,a,pos);
	
	
}
}
