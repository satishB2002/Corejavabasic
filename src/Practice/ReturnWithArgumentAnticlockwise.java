//Q3.Wap input an array and rotate it in anti clock wise by any no give by user.
package Practice;
import java.util.*;

public class ReturnWithArgumentAnticlockwise {
	int i,j,x;
	Scanner sb=new Scanner(System.in);
	public int input(int a[])
	{
		System.out.println("Enter array element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sb.nextInt();
			
		}
		return 0;
		
		
	}
	public int display(int a[])
	{
		x=a[0];
		for(i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=x;
		return 0;
	}
	public int rotation(int a[])
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		return 0;
		
	}
	public static void main(String arg[])
	{
		int a[]=new int[5];
		ReturnWithArgumentAnticlockwise  sc=new ReturnWithArgumentAnticlockwise ();
		sc.input(a);
	Scanner ss=new Scanner(System.in);
	System.out.println("How many rotate");
	int n=ss.nextInt();
		for(int j=1;j<=n;j++)
		{
			
		sc.display(a);
		sc.rotation(a);
		}
	}
}
