package classesobject9;
/*Q2.A student will not be allowed to sit in exam if his/her attendence is less than 75%.
    Take following input from user
    Number of classes held
    Number of classes attended.
    And print
    percentage of class attended
    Is student is allowed to sit in exam or not.*/
import java.util.*;
public class Exameligibleornot {
	int a,b;
	float percentage;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Number of Classes held");
		a=sc.nextInt();
		System.out.println("Number of Classes  attendence");
		b=sc.nextInt();
		percentage=(a/b)*100;
		if(percentage>75)
		{
			System.out.println("It Student is allows to sit in Exam");
		}
		else
		{
			System.out.println("It Student Not allows to sit in Exam");
		}
		
		
	}
		public static void main(String arg[])
		{
			Exameligibleornot sc=new Exameligibleornot();
			sc.input();
		}

}
