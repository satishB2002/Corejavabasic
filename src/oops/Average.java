package oops;
/*5-Print the average of three numbers entered by user by creating a class named 'Average'
having a method to calculate and print the average by  no return type with no argument.*/
import java.util.Scanner;
public class Average {
	int sum,avg,a,b,c;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
	}
	public void result()

	{
		sum=a+b+c;
		avg=sum/3;
		System.out.println("Average"+avg);
	}
	public static void main(String arg[])
	{
		Average sc=new Average();
		{
			sc.input();
			sc.result();
		}
		
	}
}
