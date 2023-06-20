//Q5.Wap intput a no and check it is prime no or not.
package RETURNWITHARGUMENT;
import java.util.*;
public class prime {
	int t,i,k;
	Scanner sc=new Scanner(System.in);
	
	public int  disp(int num)
	{
		t=0;
		k=num;
		
		for(i=2;i<num-1;i++)
		{
			if(num%i==0)
				t=num+1;
		}
		if(t==0)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
		return 0;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter no");
		int num=sc.nextInt();
		
		prime ss=new prime();
		
		ss.disp(num);
	}

}
