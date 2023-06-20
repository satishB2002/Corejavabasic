//Q4.Wap input an array and rotate it in clock wise by any no give by user.

package Practice;

import java.util.Scanner;

public class Returntype_With_Arg_Clockwise {
	int i,k,x;
	
	public int  input(int n,int a[]) {
		for(k=1;k<=n;k++)
		{
			x=a[a.length-1];
			
			for ( i =a.length-2; i >=0; i--) {
				a[i+1]=a[i];
			}
			a[0]=x;
			for ( i = 0; i < a.length; i++) {
				System.out.println(a[i]+" ");
			}
			
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("ENTER yOU WANT ROTATE");
		int n;
		int a[]= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		Returntype_With_Arg_Clockwise ss=new Returntype_With_Arg_Clockwise();
		ss.input(n,a);
	}

}
