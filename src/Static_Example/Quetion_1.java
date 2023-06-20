//Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
package Static_Example;
import java.util.*;
public class Quetion_1 {
	 static int n;
	 static int c;
	 Scanner sc=new Scanner(System.in);
	 
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		n=sc.nextInt();
		
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		
		
		
		System.out.print("Count "+c);
	}

public static void main(String arg[])
{
	Quetion_1 sc=new Quetion_1();
	
}

}
