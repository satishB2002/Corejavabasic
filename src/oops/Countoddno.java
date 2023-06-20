package oops;

import java.util.Scanner;

public class Countoddno {
int i=1,n=15,c;
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter range of odd no");
	n=sc.nextInt();
	
}
public void result()
{
		c=0;
	for(i=0;i<=n;i++)
	{
		if(i%2==0)
		{
			c++;
			
		}
	}
}
public void display()
{
	System.out.println("Count"+c);
}
public static void main(String arg[])
{
	Countoddno sc=new Countoddno();
	sc.input();
	sc.result();
	sc.display();
	
}

}
