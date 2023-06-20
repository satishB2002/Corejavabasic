package mixpractice3jan.txt;

import java.util.*;

public class Clockwise_rotation {
	int i,j,x;
	int a[]=new int[5];
	Scanner AA=new Scanner(System.in);
	Clockwise_rotation()
	{
	System.out.println("Enter Your Array");
	for(i=0;i<a.length;i++)
	{
		a[i]=AA.nextInt();
	}
	x=a[a.length-1];
	for(i=a.length-2;i>=0;i--)
	{
		a[i+1]=a[i];
	}
	a[0]=x;
	System.out.println("clockwise Rotation");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	
}
public static void main(String arg[])
{
	Clockwise_rotation aa=new Clockwise_rotation();
}

}

