package Arraydifficult;
import java.util.*;
public class inheritance_1 {
	int a,b,sum,p,q,area;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter two number22");
		p=sc.nextInt();
		q=sc.nextInt();
	}
	public void disp()
	{
		System.out.println(" sum"+(p+q));
	}
	public static void main(String arg[])
	{
		inheritance_1 sc=new inheritance_1();
		sc.input();
		sc.disp();
	}
}