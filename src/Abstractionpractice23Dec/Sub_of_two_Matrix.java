package Abstractionpractice23Dec;
import java.util.*;
abstract class Sub
{
	public abstract  void input4();
}
public class Sub_of_two_Matrix extends Sub{
	int i,j,sub;
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	public void input4() {
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
		sub=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Your Sub of Materix");
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
		Sub_of_two_Matrix ss=new Sub_of_two_Matrix();
		ss.input4();
			}

}
