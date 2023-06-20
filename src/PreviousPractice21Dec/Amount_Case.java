//Q4. Write a program to read a number and print how many number of 500, 100, 20, 10, 5, 2, 1 notes are available in the given Amount by using case?
package PreviousPractice21Dec;
import java.util.*;
public class Amount_Case {
int amt,rs500,rs100,rs50,rs20,rs10,rs5,rs2,rs1,c;
	Scanner sc=new Scanner(System.in);
	Amount_Case ()
	{
		System.out.println("Enter your Amount");
		amt=sc.nextInt();
		while(amt>=500)
		{
			rs500=amt/500;
			amt=amt%500;
			System.out.println("Total no of 500 notes="+rs500);
		}
		
		while(amt>=100)
		{
			rs100=amt/100;
			amt=amt%100;
			System.out.println("Total no of 100 notes="+rs100);
		}
		while(amt>=50)
		{
			rs50=amt/50;
			amt=amt%50;
			System.out.println("Total no of 50 notes="+rs50);
		}
		while(amt>=20)
		{
			rs20=amt/20;
			amt=amt%20;
			System.out.println("Total no of 20 notes="+rs20);
		}
		while(amt>=10)
		{
			rs10=amt/10;
			amt=amt%10;
			System.out.println("Total no of 10 notes="+rs10);
		}
		while(amt>=5)
		{
			rs20=amt/5;
			amt=amt%5;
			System.out.println("Total no of 5 notes="+rs5);
		}
		while(amt>=1)
		{
			rs1=amt/1;
			amt=amt%1;
			System.out.println("Total no of 1 notes="+rs1);
		}
	}
	public static void main(String arg[])
	{
		Amount_Case sc=new Amount_Case();
	}
}
