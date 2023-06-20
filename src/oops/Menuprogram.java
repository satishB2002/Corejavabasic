package oops;

import java.util.Scanner;

public class Menuprogram {

	double area,rectangle,triangle,square,pi=3.14,length,breadth,base,height,r,width,b,side;
	Scanner sc=new Scanner(System.in);
	public void welcome()
	{
	System.out.println("\t\t\t\t\t:: Welcome to Menu program ::");
	}
   public void input()
	{
		System.out.println("Enter radius");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("Area of circle="+area);
	}
	
	public void display()
	{
		System.out.println("Enter length ");
		length =sc.nextInt();
		System.out.println("Enter width ");
		width=sc.nextInt();
		rectangle =length*length;
		System.out.println("Area of Rectangle="+rectangle);
		
		
	}
	public void print()
	{
		System.out.println("Enter base ");
		b=sc.nextInt();
		System.out.println("Enter height ");
		height=sc.nextInt();
		triangle=1/2*b*height;
		System.out.println("Area of Triangle="+triangle);
	}
	public void display1()
	{
		System.out.println("Enter side ");
		side =sc.nextInt();
		square=side*side;
		System.out.println("Area of Square="+square);
		
	}
	public static void main(String arg[])
	{
		Menuprogram sc=new Menuprogram();
		sc.welcome();
		sc.input();
		sc.display();
		sc.print();
		sc.display1();
	
	while(true)
	{
		System.out.println("Enter 1 to be Area of circle");
		System.out.println("Enter 2 to be Area of rectangle");
		System.out.println("Enter 3 to be Area of triangle");
		System.out.println("Enter 4 to be Area of square");
		
		
		System.out.println(":: Enter your choce ::");
	

	//	int userchoice =sc.nextInt();

		
	//	switch(userchoice)
	//	{
	//	Case 1:sc.input();
		break;
		//System.exit(0);
	//	default:System.out.println("Wrong choice");
		}
		}
	}



