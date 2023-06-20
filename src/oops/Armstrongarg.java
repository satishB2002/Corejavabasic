package oops;
import java.util.Scanner;
public class Armstrongarg {
	int n,t1,t2,rem;
	Scanner sc=new Scanner(System.in);
	public void Armstrongarg()
	{
		System.out.println("Enter number");
		n=sc.nextInt();
		t1=n;
		int leng=0;
		while(t1!=0)
		{
			t1=t1/10;
			leng=leng+1;
		}
		t2=n;
		int arm=0;
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=0;i<=leng;i++)
			{
				mul=mul*rem;
				
			}
			arm=arm+mul;
			t2=t2/10;
			
		}
		if(arm==n)
		{
			System.out.println("no is armstrong");
			
		}
		else
		{
			System.out.println("not armstrong");
			
		}
		
		
	}
	public static void main(String arg[])
	{
		Armstrongarg sc=new Armstrongarg();
		{
			sc.Armstrongarg();
		}
		
		
	}
	

}
