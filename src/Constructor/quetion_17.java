package Constructor;
/*Q17.Wap to input an array and find the 2nd max element using constructor.*/
import java.util.*;
public class quetion_17 {
	int i,j,t;
	int []a=new int[10];
	Scanner sc=new Scanner(System.in);
	quetion_17()
	{
		System.out.println("Enter Number");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void disp()
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("2nd Max"+a[a.length-2]);
	}
	public static void main(String arg[])
	{
		quetion_17 sc=new quetion_17();
		sc.disp();
	}
}
