package classesobject9;
/*Q4.Write a Java program to get a number from the user and print whether it is positive or negative.*/
import java.util.*;
public class PositiveNegative {
	int num;
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter number");
		num=sc.nextInt();
		if(0<1)
		{
			System.out.println("The number is positive");
		}
		else
			System.out.println("The number is Negative");
	}
	public static void main(String arg[])
	{
		PositiveNegative sc=new PositiveNegative();
		sc.input();
	}

}
