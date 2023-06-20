package Practice;
import java.util.*;
public class With_Argument_REturn_type_Clockwiase {
	int i,j,x;
	Scanner sd=new Scanner(System.in);
public void input(int a[])
{
	System.out.println("Enter Your Array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sd.nextInt();
	}
	

}
public int display(int a[])
{
	x=a[a.length-1];
	for(i=a.length-2;i>=0;i--)
	{
	a[i+1]=a[i];
		
	}
	a[0]=x;
	
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	return 0;
}
public static void main(String arg[])
{
	int a[]=new int[5];
	With_Argument_REturn_type_Clockwiase sc=new With_Argument_REturn_type_Clockwiase();
	sc.input(a);
	Scanner sb=new Scanner (System.in);
	System.out.println("Enter Your Rotate");
	int n=sb.nextInt();
	for(int i=1;i<=n;i++) 
	{
	sc.display(a);
	}
}
}
