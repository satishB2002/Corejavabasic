package Constructor;
/*Q16.Wap replace 0's from the square of  the next element of array using constructor.
your array is-{2,0,4,8,0,5,0,5,8};*/
import java.util.*;
public class quetion_16 {
	int i;
	int []a=new int[10];
	Scanner sc=new Scanner(System.in);
	quetion_16()
	{System.out.println("Enter Number");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void disp()
	{
		for(i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=a[i+1];
				a[i]=a[i]*a[i];
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		quetion_16 sc=new quetion_16();
		sc.disp();
	}

}
