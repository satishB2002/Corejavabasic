package classesobject9;
import java.util.*;
public class OldestandYongest 
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	
	public void display()
	{
		System.out.println("Enter 1st person age");
		 a=sc.nextInt();
		System.out.println("Enter 2nd person age");
		 b=sc.nextInt();
		System.out.println("Enter 3rd person age");
		 c=sc.nextInt();
		if(a<b && a<c)
		System.out.print("Yongest is a");
		else if(b<a && b<c)
		
			System.out.print("Yongest is b");
		else
			System.out.print("Yongest is c");
		if(a>b && a>c)
			System.out.println("\nOldest is a");
			else if(b>a && b>c)
			
				System.out.println("\nOldest is b");
			else
				System.out.println("\nOldest is c");
		
			
		
		
	}
	public static void main(String sb[])
	{
		OldestandYongest sc= new OldestandYongest();
		
		sc.display();
		
	}

	}
