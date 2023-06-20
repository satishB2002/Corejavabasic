package interface_practce_ass;
import java.util.*;
public class natural_reverse1 implements natural_reverse {
int i,no;
Scanner sc=new Scanner(System.in);
	@Override
	public void display()
	{
		System.out.println("Enter no");
		no=sc.nextInt();
		int i=no;
	    while(i>1)
		{
			i--;
			System.out.println(i+" ");
		}
		
	
		
	}
	public static void main(String arg[])
	{
		natural_reverse1 ss=new natural_reverse1();
		ss.display();
		
	}

}
