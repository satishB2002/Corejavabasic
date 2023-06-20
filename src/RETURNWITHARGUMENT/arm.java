//Q3.Wap input a no and check it is armstrong no or not.
package RETURNWITHARGUMENT;
import java.util.*;
public class arm {
	int t,sum,rem;
	
	
	public int  disp(int num)
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
	
	return 0;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num=sc.nextInt();
		arm ss=new arm();
		
		ss.disp(num);
	}

}
