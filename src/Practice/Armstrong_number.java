package Practice;
import java.util.*;
public class Armstrong_number {
	public static void main(String arg[])
	{
		int i,t,sum,rem,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		n=sc.nextInt();
		t=n;
		sum=0;
		while(t!=0)
		{
			rem=t%10;
			sum=sum+(rem*rem*rem);
			t=t/10;
			
		}
		if(sum==n)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
		
	}

}
