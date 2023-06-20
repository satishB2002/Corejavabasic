//Q6.Wap input 5 digit integer value and print its reverse.
package RETURNWITHARGUMENT;
import java.util.*;
public class reverse {
	int num,rem,rev;
	Scanner sc=new Scanner(System.in);
	
	public int  disp(int num)
	{
		rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.print(rev+" ");
		return 0;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num=sc.nextInt();
		
		reverse ss=new reverse();
		
		ss.disp(num);
		
	}

}

