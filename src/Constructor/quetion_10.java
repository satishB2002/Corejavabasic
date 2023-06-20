package Constructor;
/*Q10.Wap input a no and print factorial. */
import java.util.*;
public class quetion_10 {
	int n,fact;
	Scanner sc=new Scanner(System.in);
	quetion_10 ()
	{
		System.out.println("Enter number");
		n=sc.nextInt();
	}
	public void disp()
	{
			fact=1;
		for(int i=1;i<n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial "+fact);
	}
	public static void main(String arg[])
	{
		quetion_10 sc=new quetion_10();
		sc.disp();
	}
}
