//Q6.Wap input 5 digit integer value and print its reverse.
package NORETURNNOARGUMENT_exm;
import java.util.*;
public class reverse {
	int num,rem,rev;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter no");
		num=sc.nextInt();
		
		
	}
	public void disp()
	{
		rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.print(rev+" ");
		
	}
	public static void main(String arg[])
	{
		reverse ss=new reverse();
		ss.input();
		ss.disp();
		
	}

}
