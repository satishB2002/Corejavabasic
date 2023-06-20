package oops;
/*Q1.Wap input a no and check it is palindrome or not.*/
import java.util.Scanner;
public class palindromewitharg {
	int temp, rem, rev, num, n;
    Scanner ob = new Scanner(System.in);

    void input(int n) {
        System.out.println("Enter the number");
        n = ob.nextInt();
        ob.close();
   
            temp = n;
            rev = 0;
            rem=0;

            while (temp!= 0)
            {
                rem = temp% 10;
                rev = rev * 10 + rem;
                temp= temp / 10;
            }
            if (n == rev)
            {
            
            	 System.out.print(n + " palindrome");
            }
            else
            {
            	System.out.print(n + " Not palindrome");
            }
        }
    
        public static void main(String[]args)
        {
        	 palindromewitharg ob = new   palindromewitharg();
             ob.input(0);
            
}


		
}

