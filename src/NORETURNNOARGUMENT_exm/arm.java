//Q3.Wap input a no and check it is armstrong no or not.
package NORETURNNOARGUMENT_exm;
import java.util.*;
public class arm {
	int t,sum,rem,num;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter no");
		num=sc.nextInt();
		
		
	}
	public void disp()
	{
	t=num;
	sum=0;
	while(t!=0)
	{
		rem=t%10;
		sum=sum+(rem*rem*rem);
		t=t/10;
	}
	if(sum==num)
	{
		System.out.println("Arm");
	}
	else
		System.out.println(" Not Arm");
	
	}
	public static void main(String arg[])
	{
		arm ss=new arm();
		ss.input();
		ss.disp();
	}

}
