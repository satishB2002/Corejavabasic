package Constructor;
import java.util.*;
/*Q2.Wap enter 5 digit  no and print only even no.*/
public class quetion_2 {
	int i,n,rem;
	Scanner sc=new Scanner(System.in);
	quetion_2()
	{
		System.out.println("Enter Number");
		n=sc.nextInt();
		
		
		while(n!=0)
		{
			rem=n%10;
			if(rem%2==0)
			
				System.out.println(rem+" ");
			n=n/10;
		}
	}
	public static void main(String arg[])
			{
		quetion_2 sc=new quetion_2();
			}
}
