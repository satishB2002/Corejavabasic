/*Q7.Wap to create interface Print the average of three numbers entered by user by creating a class named 'Average' having a
   method to calculate and print the average.*/
package interface_practce_ass;
import java.util.*;
public class Average_1 implements Average {
	int a,b,c,sum,avg;
	Scanner sc=new Scanner(System.in);

	@Override
	public void avg() {
		sum=0;
		
		System.out.println("Enter Your Three Number ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum=a+b+c;
		avg=sum/3;
		System.out.println("Your Average"+avg);
		
		
		
		
	}
	public static void main(String arg[])
	{
		Average_1 ss=new Average_1();
		ss.avg();
	}

}
