package AsswithargNoarg;
/*Q5.WAP to check if an array of integers contains two specified elements. */
import java.util.*;
public class SearchTwoelement {
	Scanner sc=new Scanner(System.in);
	public void input(int a[])
	{
			int i;
		System.out.println("Enter Your Element");
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter your Search 1st element");
		int n1=sc.nextInt();
		System.out.println("Enter your Search 2nd element");
		int n2=sc.nextInt();
		int k=0,h=0;
		for( i=0;i<a.length;i++)
		{
			if(n1==a[i])
			k++;
		}
		if(k==1)
			System.out.println("Element 1st Found");
		else
			System.out.println("Element 1st Not Found");
		for( i=0;i<a.length;i++)
		{
			if(n2==a[i])
			h++;
		}
		if(h==1)
			System.out.println("Element 2nd Found");
		else
			System.out.println("Element 2nd Not Found");
	}
	
	public static void main(String arg[])
	{
		int a[]=new int [10];
		SearchTwoelement sc=new SearchTwoelement();
		sc.input(a);
		
	}

}
