package Practice;

import java.util.Scanner;

public class Smallest_Digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	
	 System.out.println ("Enter the number");
     int num = sc.nextInt ();
     int reminder, smallest=num%10;
    while (num > 0)
    {
        reminder = num % 10;
        if (smallest> reminder) 
        {
            smallest= reminder;
        }
        num = num / 10;
    }
    System.out.println("\nThe Smallest Digit is "+smallest);
}
}
