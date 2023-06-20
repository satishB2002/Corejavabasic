package oops;
/*4-wap to create two method first is input(),and second is result().you have to find 
the area of circle by taking input by user with no  return type with no argument.*/
import java.util.Scanner;
public class areaofcircle {
double pi=3.14,r,area;
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Radius");
	r=sc.nextDouble();
	area=pi*r*r;
	
}
public void result()
{
	System.out.println("Area of circle"+area);
	
	
}
public static void main(String arg[])
{
	areaofcircle sc=new areaofcircle();
	sc.input();
	sc.result();
	
}


}
