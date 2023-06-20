package interface_practce_ass;
import java.util.*;
public class Area_of_circle_1 implements Area_Of_Circle{
	double pi=3.14;
	double radius;
	double Area_of_circle;
	Scanner sc=new Scanner(System.in);

	@Override
	public double input() {
		System.out.println("Enter Your Radius");
		radius=sc.nextInt();

		return 0;
	}

	@Override
	public double display() {
		Area_of_circle=pi*radius*radius;
		System.out.println("Area_of_circle="+Area_of_circle);
		return 0;
	}
	public static void main(String arg[])
	{
		Area_of_circle_1 ss=new Area_of_circle_1();
		ss.input();
		ss.display();
	}

	

	
	
}
