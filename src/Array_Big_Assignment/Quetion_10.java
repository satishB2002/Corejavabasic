//Q10.Wap enter an array and search any particular element and find the count.

package Array_Big_Assignment;

import java.util.Scanner;

public class Quetion_10 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9,2};
	int c=0,ele,k=0;
	Scanner sc=new Scanner(System.in);
	public void replace() {
		System.out.println("Enter You Want Search Ele");
		ele=sc.nextInt();
		for (i = 1; i < a.length; i++) 
		{
			if(a[i]==ele)
			{
				c++;
				k++;
			}
			if(a[i]==ele)
			{
				
				k++;
				break;
			}
			
		}
		if(k==1)
		{
			System.out.println("Ele are Found");
		}
		else
			System.out.println("Ele are Not  Found");
			
			System.out.println("Count Ele= "+ele);
			
		
		
	}
	public static void main(String[] args) {
		Quetion_10 ss=new Quetion_10 ();
		ss.replace();
	}

}
