package Practice;
import java.util.*;
public class Insert_Element {
int i,j,ele,pos;
int n=10;
int a[]=new int[n+1];
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Array");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter Your Element");
	ele=sc.nextInt();
	System.out.println("Enter Your Positin");
	pos=sc.nextInt();
	for(i=a.length-1;i>pos-1;i--)
	{
		a[i]=a[pos-1];
		
	}
	pos=ele;
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");

		
	}
	
}
	public static void main(String arg[])
	{
		Insert_Element ss=new Insert_Element();
		ss.input();
	}

}
