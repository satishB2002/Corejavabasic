package classesobject9;
/*Q9) Wap for Fibonacci Series in Java*/
import java.util.*;
public class FibonacciSeries {
	int n1=0,n2=1,n3;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		for(int i=1;i<=45;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
	
		}
	}
		public static void main(String arg[])
		{
			FibonacciSeries sc=new FibonacciSeries();
			sc.input();
		
	}

}
