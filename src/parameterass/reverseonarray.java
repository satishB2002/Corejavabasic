package parameterass;
/*Q11.Wap enter an array and print it in reverse order.*/
import java.util.*;
public class reverseonarray {
	int i;
	Scanner sc=new Scanner(System.in);
	public void main(int a[])
	{System.out.println("Enter array " );
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void disp(int a[])
	{
		for(i=a.length-1;i>0;i--)
		{
		
		}
		for(i=a.length-1;i>0;i--)
		{
		System.out.println(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		int []a=new int[10];
		reverseonarray sc=new reverseonarray();
		sc.main(a);
		sc.disp(a);
		
	}

}
