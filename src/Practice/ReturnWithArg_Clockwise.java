//Q4.Wap input an array and rotate it in clock wise by any no give by user.
package Practice;
import java.util.*;
public class ReturnWithArg_Clockwise {
	int i,j,x;
	Scanner ss=new Scanner(System.in);
	public int input(int a[])
	{
		System.out.println("Enter Array Element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=ss.nextInt();
		}
		return 0;
		
	}
	public int disp(int a[])
	{
		x=a[a.length-1];
		for(i=a.length-2;i>=0;i--)
		{
			a[i+1]=a[i];
			
		}
		a[0]=x;
		return 0;
	}
	public int result(int a[])
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
		ReturnWithArg_Clockwise sc=new ReturnWithArg_Clockwise();
		sc.input(a);
		Scanner ob=new Scanner(System.in);
		System.out.println("How many time rotate");
		int n=ob.nextInt();
		for(int j=1;j<=n;j++)
		{
			sc.disp(a);
		    sc.result(a);
		    System.out.println();
		}
	}

}
