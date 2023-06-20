package Practice;
import java.util.*;
public class arm_series {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		int i,j,k,n,sum,rem,t;
		System.out.println("Enter Your Strt Range");
		k=sc.nextInt();
		System.out.println("Enter Your Last Range");
		n=sc.nextInt();
		n=500;
		for(i=k;i<n;i++)
		{
			t=i;
			sum=0;
			while(t!=0)
			{
				rem=t%10;
				sum=sum+(rem*rem*rem);
				t=t/10;
				
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
		}
	}

}
