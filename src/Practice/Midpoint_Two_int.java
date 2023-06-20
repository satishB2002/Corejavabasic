package Practice;
/*Q8. Write a Java method that accepts three integers and returns 
 * true if one of them is the middle point between the other two 
 * integers, otherwise false. 
Expected Output:

Input the first number:  2
Input the second number:  4
Input the third number:  6
Check whether the three said numbers has a midpoint!
true*/

import java.util.Scanner;

public class Midpoint_Two_int {
	Scanner sc=new Scanner(System.in);
	
	
public boolean input() {
	System.out.println(" the first number:");
	int n1=sc.nextInt();
	System.out.println(" the second number:");
	int n2=sc.nextInt();
	System.out.println(" the third number:");
	int n3=sc.nextInt();//(12/2, 8/2) = (6, 4).
    if((n1/2)+(n3/2)==n2)
	
    
	return true;
    
	else
	
	return false;
	
	
}
public static void main(String[] args) {
	Midpoint_Two_int ss=new Midpoint_Two_int();
	ss.input();
	
	
}
}
