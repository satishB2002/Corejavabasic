//Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
package Static_Example;
import java.util.*;
public class leaf_Year {
	static int  n;
	static int  year;
	static 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Year");
		n=sc.nextInt();
		
			if(n%4==0)
				System.out.println("Year is Leaf");
			else
			System.out.println("Year is Not Leaf");
		
		
	}
		public static void main(String arg[])
		{
			leaf_Year ss=new leaf_Year();
		}
		
	

}
