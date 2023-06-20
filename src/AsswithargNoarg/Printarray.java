package AsswithargNoarg;
/*Q1.Wap enter an array and find the sum and count of even element.*/
import java.util.*;
public class Printarray {
	Scanner sc =new Scanner(System.in);
	public void input(int a[])
	{
		int sum=0;int c=0;
		for(int i=1;i<a.length;i++)
		{
			if(i%2!=0)
			{
				sum=sum+a[i];
				c++;
				System.out.println(" "+a[i]);
			}
		}
			System.out.println("Sum of Even="+sum);
			System.out.println("Even of Count="+c);
			
		
	}
	public static void main(String arg[])
	{
		int n=10;
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Printarray  sc=new Printarray ();
		sc.input(a);
		
	}
	

}
