package Abstractionpractice23Dec;
import java.util.*;
abstract class Reverse
{
	public abstract void reverse();
	
}
public class Reverse_Array extends Reverse{
Scanner sc=new Scanner(System.in);

int i,j;
int a[]=new int[10];

public void reverse() {
	System.out.println("Enter Array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Reverse Array");
	for(i=a.length-1;i>=0;i--)
	{
		System.out.println(+a[i]+" ");
	}
		
	
}
public static void main(String arg[])
{
	 Reverse_Array ss=new  Reverse_Array();
	 ss.reverse();
	 
}
}
