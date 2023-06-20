package parameterass;
/*Q8.Wap enter an array and print the element which is on even position.*/
import java.util.*;
public class arrayevenposition {
	int i,j;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
	public void display()
	{
		for(i=0;i<a.length;i=i+1)
		{
			
				a[i+1]=a[i];
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		
		arrayevenposition sc =new arrayevenposition();
		sc.input();
		sc.display();
	}
	}


