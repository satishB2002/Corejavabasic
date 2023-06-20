package classesobject9;
/*Q5. Take three numbers from the user and print the greatest number*/
import java.util.*;
public class Greatest3 {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter three Number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("a is Greatest");
		else if(b>a  && b>c)
			System.out.println("b is Greatest");
		else if(c>a  && c>b)
			System.out.println("c is Greatest");
			
			
		
	}
	public static void main(String arg[])
	{
		Greatest3 sc= new Greatest3();
		sc.input();
	}

}
