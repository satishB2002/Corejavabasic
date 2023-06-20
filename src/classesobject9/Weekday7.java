package classesobject9;
/*Q6. Write a Java program that keeps a number from the user and generates an integer between 1 and 7
and displays the name of the weekday*/
import java.util.*;
public class Weekday7 {
	int num;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter 1 to Mondy");
		System.out.println("Enter 2 to Tuesday");
		System.out.println("Enter 3 to Wendsday");
		System.out.println("Enter 4 to Thursday");
		System.out.println("Enter 5 to Fiiday");
		System.out.println("Enter 6 to Saturday");
		System.out.println("Enter 7 to Sunday");
		System.out.println("Enter Your Choice Weekday");
		num = sc.nextInt();
		
		
		switch(num)
		{
		case 1:
				System.out.println(" Mondy");
				break;
		case 2:
			    System.out.println(" Tuesday");
				break;
	    case 3:
				System.out.println(" Wendesday");
				break;
		case 4:
				System.out.println(" Thursday");
					break;
		case 5:
			System.out.println(" Friday");
				break;
		case 6:
			System.out.println(" Saturday");
				break;
		case 7:
			System.out.println(" Sunday");
				break;
	 	default:System.out.println(" Wrong choice");
	 		break;
		
		}
	}
		public static void main(String sb[])
		{
			Weekday7 sc=new Weekday7();
			sc.input();
			
		}
		
	}


