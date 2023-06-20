package ReturntypewithArgumentmethod;

import java.util.Scanner;
public class Majority_element {
	int i,j,n,v=-1,c;
	
	Scanner sc=new Scanner(System.in);
	public int input(int a[],int b[])
	{
		System.out.println("Enter Array element");
		n=a.length/2;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
           c=1;
			for(j=i+1;j<a.length;j++)
			{
				
			   if(a[i]==a[j])
			   {
				   b[j]=v;
				   c++;
			   }	
			}
			if(b[i]!=v)
			{
				b[i]=c;
			}
		
		 
			if(b[i]>n)
			{
				System.out.println("Majority Element"+a[i]);
				break;
			}
		}
		return 0;
		}
	
	public static void main(String arg[])
	{
		int a[]=new int[8];
		int b[]=new int[a.length];
		Majority_element sb=new Majority_element();
		sb.input(a,b);	
		}

}
