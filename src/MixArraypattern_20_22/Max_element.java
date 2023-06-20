//Q7. Write a Java program to find max number in an array.
package MixArraypattern_20_22;
import java.util.*;
public class Max_element {
	int i,j,max;
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
		public void max()
		{
			max=0;
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
					if(a[i]>max)
					{
						max=a[i];
					}
				}
			}
			System.out.println("Max is="+max);
		}
		
	
	public static void main(String arg[]) 
	{
		Max_element sb=new Max_element();
		sb.input();
		sb. max();
	}

}
