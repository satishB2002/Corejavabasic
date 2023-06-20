package Constructor;
/*Q3.Wap enter 5 digit  no and print only odd no.*/
import java.util.*;
public class quetion_3 {
	int i,n,rem;
	Scanner sc=new Scanner(System.in);
	quetion_3()
	{
		System.out.println("Enter Number");
		n=sc.nextInt();
		
		
		while(n!=0)
		{
			rem=n%10;
			if(rem%2!=0)
			
				System.out.println(rem+" ");
			n=n/10;
		}
	}
	public static void main(String arg[])
			{
		quetion_3 sc=new quetion_3();
			}
}

