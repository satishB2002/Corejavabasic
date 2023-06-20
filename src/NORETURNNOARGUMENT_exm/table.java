//Q10.Wap input a no and print table till that no;
package NORETURNNOARGUMENT_exm;
import java.util.Scanner;
public class table {
	int n;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter number");
		n=sc.nextInt();
		
	}
	public void disp()
	{
		int i,j;
		
		for(i=1;i<=n;i++)
		{
									
					for(j=1;j<=n;j++)
					{
					System.out.print(i*j+"  ");
	                               }
			System.out.println();
	}	
	}
		
	
	
	public static void main(String arg[])
	{
		table ss=new table();
		ss.input();
		ss.disp();
	}
	

}
