package Rabbit_Practice;
import String.intern_method;

//5. Write a Java program to check if a given number is a prime number.
public class O5 {
public static void main(String[] args) {
	int n=121;
	int	c=0;
	int i,j=2;
	while (n!=0) {
		if (n%j==0)
			c++;
	}
	
	if (c==2) {
		System.out.println("Palindrome");
	} else 
		System.out.println(" Not Palindrome");
	
}
}
