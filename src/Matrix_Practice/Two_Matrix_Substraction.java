package Matrix_Practice;
import java.util.*;
public class Two_Matrix_Substraction {
int i,j;
int a[][]=new int [3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
Scanner barate=new Scanner(System.in);
public void Satish() {
	System.out.println("Enter Your First Matrix");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			a[i][j]=barate.nextInt();
		}
	}
	System.out.println("Enter Your Second Matrix");
	for(i=0;i<b.length;i++)
	{
		for(j=0;j<b.length;j++)
		{
			b[i][j]=barate.nextInt();
		}
	}
}
public void pune() {
	for(i=0;i<c.length;i++)
	{
		for(j=0;j<c.length;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
		}
	}
	System.out.println("Your Substraction");
	for(i=0;i<c.length;i++)
	{
		for(j=0;j<c.length;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
}
public static void main(String[] args) {
	Two_Matrix_Substraction ss=new Two_Matrix_Substraction();
	ss.Satish();
	ss.pune();
}
}
