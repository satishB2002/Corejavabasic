package Constructor;
/*Q13. . Write a program to sort the 10 elements from array. 
input in constructor and final result through the method. */
import java.util.*;
public class quetion_13 {
	Scanner sc=new Scanner(System.in);
	int []a=new int[10];
	int i,j,t;
	quetion_13()
	{
		System.out.println("Enter Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void disp()
	{ 
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
		public static void main(String arg[])
		{
			quetion_13 sc=new quetion_13();
			sc.disp();
		}
	
}
