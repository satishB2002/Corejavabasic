package AssClassloaderwithMethod;
/*Q14.Wap input a matrix and and find the transpose of matrix using third container.*/
import java.util.*;
public class quetion_14 {
	int i,j;
	Scanner sc=new Scanner(System.in);
	quetion_14()
	{
		int [][]a=new int[3][3];
		int [][]b=new int[3][3];
	
		System.out.println("Enter Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Non Transpose Matrix");
		for(i=0;i<3;i++)
		{
			
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix");
		
		for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			b[i][j]=a[i][j];
			
		}
		
	}
	for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[j][i]+" ");
				
			}
			System.out.println();
			
		}

}
	public static void main(String arg[])
	{
		quetion_14 sc=new quetion_14();
	}
}
