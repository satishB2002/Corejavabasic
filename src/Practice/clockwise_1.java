package Practice;
import java.util.*;
public class clockwise_1 {
	public static void main(String arg[])
	{
		int i,x;
		int a[]= {1,2,3,4,5};
		x=a[a.length-1];
		for(i=a.length-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=x;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
