package oops;
import java.util.*;
public class Palindrome
{
	      
	int  rem, rev, n,temp;
    Scanner sc = new Scanner(System.in);

   void input() {
        System.out.println("Enter the number");
        n = sc.nextInt();
        sc.close();
    }

    void display() {

            temp=n;
            rev = 0;
            rem=0;
           do
            {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp= temp / 10;
            }
           while (temp!= 0);
            if (n== rev)
            {
                System.out.print(n + "It is  palindrome");
            }
            else
            {
            	System.out.print(n + "It is Not palindrome");
            }

        }
    
        public static void main(String[]args)
        {
        	Palindrome sc = new  Palindrome();
            sc.input();
            sc.display();
}
}
