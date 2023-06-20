package Abstractionpractice23Dec;
import java.util.*;
abstract class input5
{
	public abstract void inner();
	public abstract void display();
}
public class Frequency_of_Character extends input5{
int i,j;
char a[]=new char[10];
int  b[]=new int[a.length];

Scanner sc=new Scanner(System.in);
@Override
public void inner() {
	System.out.println("Enter Your Character");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.next().charAt(0);
	}
	
}
@Override
public void display() {
	int v=-1;
	int c;
	v=-1;
	for(i=0;i<a.length;i++)
	{
		c=1;
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				b[j]= v;
				c++;
				
			}
		}
		if(b[i]!=v)
		{
			b[i]= c;
		}
	}
	for(i=0;i<a.length;i++)
	{
		if(b[i]!=v)
		{
			System.out.println(a[i]+" "+b[i]);
		}
	}
}
public static void main(String arg[])
{
	 Frequency_of_Character ss=new  Frequency_of_Character();
	 ss.inner();
	 ss.display();
}
}
	


