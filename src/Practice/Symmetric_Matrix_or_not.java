package Practice;
import java.util.*;
//Q4.Write a java in java to check matrix is Symmetric Matrix or not.

public class Symmetric_Matrix_or_not {
	int i,j;
	int a[][]=new int[3][3];
	Scanner sc=new Scanner(System .in);
	public void input()
	{
	System.out.println("Enter Your Matrix");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
		a[i][j]=sc.nextInt();
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
	      System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Transpose Matrix");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
	if(a[i][j]==a[j][i])
	{
		System.out.println("Matrix Are Symmetric ");
	}
	else
	System.out.println("Matrix Are Not Symmetric ");
	
	}
	
	public static void main(String arg[])
	{
		Symmetric_Matrix_or_not ss=new Symmetric_Matrix_or_not();
		ss.input();
		
	}
	

}
