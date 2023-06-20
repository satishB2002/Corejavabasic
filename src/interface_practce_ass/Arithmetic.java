package interface_practce_ass;
import java.util.*;
public class Arithmetic implements Test{
	double num,square;
Scanner sc=new Scanner(System.in); 
	@Override
	public void square() {
		System.out.println("Enter Your no");
		num=sc.nextInt();
		square =num*num;
		System.out.println("Your no="+num+" "+"\nYour Square="+square);
		
	}
	public static void main(String arg[])
	{
		Arithmetic ss=new Arithmetic();
		ss.square();
	}

}
