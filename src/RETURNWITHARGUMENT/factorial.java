//Q2.Wap input a no and find the factorial
package RETURNWITHARGUMENT;
import java.util.*;
public class factorial {
	int fact;


public void disp(int num)
{

	fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
		
	}
	System.out.println("Factorial="+fact);
	
}
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int num=sc.nextInt();
	
	factorial ss=new factorial();
	
	ss.disp(num);
}

}
