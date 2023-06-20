package Exception;

import java.util.Scanner;

public class Calculator_2 extends Calculator_1{
double a,b;
Scanner sc=new Scanner(System.in);
	@Override
	public void input() {
		System.out.println("-+-+-+-+= $ Calculator $=-+-+--+-");
		
	System.out.println("Enter Your First number");
	a=sc.nextShort();
	System.out.println("Enter Your Second  number");	
	b= sc.nextDouble();	
	System.out.println("Enter 1 To be Addition");
	System.out.println("Enter 2 To be Substaction");
	System.out.println("Enter 3 To be Multiplication");
	System.out.println("Enter 4 To be Division");
	}

	@Override
	public void Addition() {
		// TODO Auto-generated method stub
		System.out.println("Addition="+(a+b));
	}

	@Override
	public void Substaction() {
		// TODO Auto-generated method stub
		System.out.println("Substraction="+(a-b));
	}

	@Override
	public void Multiplication() {
		// TODO Auto-generated method stub
		System.out.println("Muliplication="+(a*b));
	}

	
	public void Division() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Division="+(a/b));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not Divisible By Zero");
		}
	}

}
