package oops;
/*7-wap to create two method input and display and take input of roll number, phone number and address of two students having names "Sam" and "John" 
and display using no return no argument.*/
import java.util.*;
public class Student {
	int r1,r2,r3;
	double p1,p2,p3;
	String a1,a2,a3;
	Scanner sc =new Scanner(System.in);
	public void input()
	{
		r1=sc.nextInt();
		r2=sc.nextInt();
		r3=sc.nextInt();
		p1=sc.nextDouble();
		p2=sc.nextDouble();
		p3=sc.nextDouble();
		a1=sc.next();
		a2=sc.next();
		a3=sc.next();
		
	}
	public void display()
	{
		System.out.println("name           roll no      phone no                address");
		System.out.println(" Sam           "+r1+"        "+p1+"                  "+a1);
		System.out.println(" raj            "+r2+"       "+p2+"                  "+a2);
		System.out.println(" sai             "+r3+"       "+p3+"                 "+a3);
		
	}
	public static void main(String arg[])
	{
		Student sc=new Student();
		sc.input();
		sc.display();
	}
}
