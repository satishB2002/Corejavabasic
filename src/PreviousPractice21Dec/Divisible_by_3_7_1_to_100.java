//Q6. Write a program to print the numbers which are divisible by both 3 and 7 from 1 to 100?
package PreviousPractice21Dec;
import java.util.*;
public class Divisible_by_3_7_1_to_100 {
	int i,j,t;
	Divisible_by_3_7_1_to_100()
	{
		for(i=1;i<=100;i++)
		{
		if(i%3==0  && i%7==0)
			
		 System.out.print(i+" ");
			
		}
	}
	
	public static void main(String arg[])
	{
		Divisible_by_3_7_1_to_100 ss=new Divisible_by_3_7_1_to_100();
	}
}
