/*Q5.Wap initialise a 3*3 matrix and search any  two element and print the condition:
       only 1st element found
        only 2nd element found
        both element found
         not any element found*/

package MixArraypattern_20_22;
import java.util.*;
public class Matrix_Search_Two {
int i,j,f,s,c,d;
int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Search First Element");
	f=sc.nextInt();
	System.out.println("Enter Search Second Element");	
	s=sc.nextInt();
	
}
public void disp()
{
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			if(a[i][j]==f)
			{
				c++;
			}
		}
	}
	if(c!=0)
		System.out.println("First element found ");
	else
		System.out.println("First element NOT found ");

	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			if(a[i][j]==s)
				d++;
			
		}
	}
	if(d!=0)
	System.out.println("Second no is Found");
	else
		System.out.println("Second no is not Found");
	if(c!=0  &&   d!=0)
		System.out.println("Both Element are found");
	else
		System.out.println("Both Element are Not found");
	if(c==0 && d==0)
		System.out.println("Not any Element are found");
	else
		System.out.println(" ");
}

public static void main(String arg[])
		{
	Matrix_Search_Two sb=new Matrix_Search_Two();
	sb.input();
	sb.disp();
	//sb.disp1();
	}
}

