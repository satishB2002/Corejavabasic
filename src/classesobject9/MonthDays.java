package classesobject9;
/*Q7. Write a Java program to find the number of days in a month*/
import java.util.*;
public class MonthDays {
	int n;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("press 1 to Jan");
		System.out.println("press 2 to Feb");
		System.out.println("press 3 to Mar");
		System.out.println("press 4 to Apr");
		System.out.println("press 5 to May");
		System.out.println("press 6 to Jun");
		System.out.println("press 7 to July");
		System.out.println("press 8 to Aug");
		System.out.println("press 9 to Sep");
		System.out.println("press 10 to Oct");
		System.out.println("press 11 to Nov");
		System.out.println("press 12 to Dec");
		System.out.println("Enter choice months");
		n=sc.nextInt();
		if(n==1)
			System.out.println(" January 31");
		if(n==2)
			System.out.println("February  28 or 29");
		if(n==3)
			System.out.println("March  30");
		if(n==4)
			System.out.println("April  31");
		if(n==5)
			System.out.println("May  30");
		if(n==6)
			System.out.println("Jun 31 ");
		if(n==7)
			System.out.println("July 30");
		if(n==8)
			System.out.println("August 31");
		if(n==9)
			System.out.println("September 30");
		if(n==10)
			System.out.println("October 31");
		if(n==11)
			System.out.println("November 30");
		if(n==12)
			System.out.println("December 31");
		
	}
	public static void main(String arg[])
	{
		MonthDays sc=new MonthDays();
		  sc.input();
	}

}
