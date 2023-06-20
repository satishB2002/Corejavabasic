package Practice;
import java.util.*;
public class SMallest_k {
int i,j,k,t;
int a[]= {7,10,4,3,20,15};

	public void input()
	{
		k=3;
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
		System.out.println("Smallest k"+a[k-1]);
	}
	public static void main(String arg[])
	{
		 SMallest_k ss=new SMallest_k ();
		 ss.input();
		 
	}

}
