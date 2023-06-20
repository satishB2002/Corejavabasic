package parameterass;
/*Program to print the  square of the elements of an array present on odd position.*/
import java.util.*;
public class oddpositionsquare {
	int i;
	Scanner sc=new Scanner(System.in);
	public void input(int a[])
	{
		System.out.println("Enter Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	}
	public void disp(int a[])
	{
		for(i=0;i<a.length;i=i+2)
		{
			a[i]=a[i+1];
			a[i]=a[i]*a[i];
		}
		for(i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		int a[]=new int[10];
		oddpositionsquare sc=new oddpositionsquare();
		sc.input(a);
		sc.disp(a);
	}

}
