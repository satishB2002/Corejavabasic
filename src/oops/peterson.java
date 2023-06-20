package oops;
import java.util.Scanner;
public class peterson {
int i,j,rem,sum,fact,num,t;
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Number");
	num=sc.nextInt();
}
public void fact()
{t=num;
	while(t!=0)
	{
		rem=t%10;
		fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		sum=sum+fact;
		t=t/10;
	}
		
			if(sum==num)
			{
				System.out.println("Peterson");
			}
				else
				{
					System.out.println("Not Peterson");
				}
		}
	

public static void main(String ar[])
{
	 peterson sc=new  peterson();
	 sc.input();
	 sc.fact();
}
}
