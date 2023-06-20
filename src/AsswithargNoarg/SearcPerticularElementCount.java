package AsswithargNoarg;
/*Q4.Wap enter an array and search any particular element and find the count.*/
import java.util.*;
public class SearcPerticularElementCount {
	Scanner sc=new Scanner(System.in);
	public void input(int a[])
	{
		System.out.println("Enter Element");
		for(int i=0;i<a.length;i++)
		{
		
		 a[i]=sc.nextInt();
	    }
		int k=0,c=0;
		System.out.println("Enter Your Search Element");
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i]);
			k=1;
			
		}
		if(k==1)
			System.out.println("Element Found");
		else
			
			System.out.println("Element Not Found");
		c++;
		System.out.println("Count is "+c);
		}
		
	
	public static void main(String arg[])
	{
			
		int a[]=new int[10];
		SearcPerticularElementCount sc =new SearcPerticularElementCount();
		sc.input(a);
	}

}
