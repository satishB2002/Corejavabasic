/*Q8:Write a program to  input first and last number and print prime series between inputed range.*/
package MixPracticeSimpleMethodCnstructorInheritance;
import java.util.*;
public class PrimeSeries {
	{
	int k,n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("To Start Range");
k=sc.nextInt();
System.out.println("To Last Range");
n=sc.nextInt();
for(i=k;i<n;i++)
{
	for(j=2;j<i;j++)
	{
		if(i%j==0)
			break;
			
	}
	if(i==j)
	System.out.println(i+" ");
}
	}
public static void main(String arg[])
{
	PrimeSeries sc=new PrimeSeries();
}


}