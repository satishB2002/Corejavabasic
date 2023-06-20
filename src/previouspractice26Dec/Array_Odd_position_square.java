//7.Java Program to print the  square of the elements of an array present on odd position.
package previouspractice26Dec;
import java.util.*;
public class Array_Odd_position_square {
int i,j;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
public void input()
{

	System.out.println("Enter Array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}

	for(i=0;i<a.length;i++)
	{
	if(i%2==0)
	{
		a[i]=a[i]*a[i];
	}
	}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	

}
public static void main(String arg[])
{
	Array_Odd_position_square ss=new Array_Odd_position_square();
	ss.input();
	}
}
