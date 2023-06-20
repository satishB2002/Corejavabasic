package Abstractionpractice23Dec;
import java.util.*;
abstract class Sum
{
	public abstract void input3();
}
public class Sum_of_Two extends Sum{
	int i,j,sum;
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	@Override
	public void input3() {
		System.out.println("Enter Your First Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Your Second Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		sum=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Your Sum of Materix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		Sum_of_Two ss=new Sum_of_Two();
		ss.input3();
	}
			

}
