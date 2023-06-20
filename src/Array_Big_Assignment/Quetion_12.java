
package Array_Big_Assignment;

import java.util.Scanner;

public class Quetion_12 {
	Scanner sc =new Scanner(System.in);
	int i,j,c=0;
	int a[]=new int[10];
	public void input()
	{
	System.out.println(" Enter Your element");
	
	for (i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println(" Your Duplicate element");
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.print(a[j]+" ");
				c++;
				
			}
		}
	}
	System.out.println("Count Of Duplicate="+c);
	}
	public static void main(String[] args) {
		Quetion_12  ss=new Quetion_12 ();
		ss.input();
	}


}
