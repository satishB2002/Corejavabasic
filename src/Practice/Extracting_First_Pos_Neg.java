package Practice;

import java.util.Scanner;

/*Q1. Write a Java method to develop a Java method for extracting the first digit from a positive or 
 * negative integer. 

Expected Output:

Input an integer(positive/negative): 1234
Extract the first digit from the said integer:
1*/
public class Extracting_First_Pos_Neg {
	Scanner sc=new Scanner(System.in);
public void input() {
	System.out.println("Enter Your Digit");
	int t=sc.nextInt();
	int rem;
	int first_dig=0;
	while(t!=0)
	{
		rem=t%10;
		//System.out.println(rem);
		
		if(rem>first_dig  )
		{
			first_dig=rem;
			System.out.println(1);
		}
		
		t=t/10;
	}
	
	
}
public static void main(String[] args) {
	Extracting_First_Pos_Neg ss=new Extracting_First_Pos_Neg();
	ss.input();
}
}
