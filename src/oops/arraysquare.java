package oops;
/*8-wap to find the area of square,circle,rectalgle,triangle in their own method and display in another method.*/
import java.util.*;
public class arraysquare{
	
		double area,rectangle,triangle,square,pi=3.14,length,breadth,base,height,r,width,b,side;
		Scanner sc=new Scanner(System.in);
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
			arraysquare sc=new arraysquare();
			sc.input();
			sc.display();
			sc.print();
			sc.display1();
		}
	}

	