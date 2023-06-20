//Q3. . Write a program to sort the 10 elements from array. 
package AssInheritance;
import java.util.*;
 class sort
{
	 Scanner sc=new Scanner(System.in);
	 int i,j,t;
	 int []a=new int [10];
	public void start()
	{
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
}

class given extends sort
{
	public void stop()
	{
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++) 
		{if(a[i]>a[j])
	     	{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
	       	}
		}
		
	}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	
	}
}

public class quetion3 {
	public static void main(String arg[])
	{
		given sc=new given();
		sc.start();
		sc.stop();
	}

}
