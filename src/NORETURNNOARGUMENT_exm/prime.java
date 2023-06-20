//Q5.Wap intput a no and check it is prime no or not.
package NORETURNNOARGUMENT_exm;
import java.util.*;
public class prime {
	int t,num,i,k;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter no");
		num=sc.nextInt();
		
		
	}
	public void disp()
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
	}
	public static void main(String arg[])
	{
		prime ss=new prime();
		ss.input();
		ss.disp();
	}

}
