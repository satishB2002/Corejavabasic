/*Q.3Find the majority element in the array. A majority element in an array A[] of size n is an element 
   that appears more than n/2 times (and hence there is at most one such element). 

Examples : 

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4*/
package Array_Pattern;
import java.util.*;
public class Majority_element {
	int i,j,n,v=-1,c;
	int a[]=new int[8];
	int b[]=new int[a.length];
	Scanner sc=new Scanner(System.in);
	public void input()
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
		}
	
	public static void main(String arg[])
	{
		Majority_element sb=new Majority_element();
		sb.input();	
		}

}
