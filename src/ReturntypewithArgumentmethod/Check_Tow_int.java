//Q5.WAP to check if an array of integers contains two specified elements. 

package ReturntypewithArgumentmethod;
import java.util.*;
public class Check_Tow_int {
int i,j,c,ele1,ele2,k=0;
Scanner sc=new Scanner(System.in);
public int input(int a[])
{
	System.out.println("Search First Element");
	ele1=sc.nextInt();
	int f=0;
	c=0;
	for(i=0;i<a.length;i++)
	{
		
		if(a[i]==ele1)
		{
			c++;
		f=1;
		}
		
	}
	System.out.println("Count of First Ele="+c);

		if(f==1)
		
			System.out.println("First Element Found");
		
		else
		System.out.println("First Element Not Found");
		System.out.println("Search Second  Element");
		ele2=sc.nextInt();
		k=0;
		int s=0;
		for(i=0;i<a.length;i++)
		{
			
				if(a[i]==ele2)
				{
					k++;
				s=1;
				}
				
		}
		System.out.println("Count of Second Ele="+k);
		if(s==1)
		{
			System.out.println("Second Element Found");
		}
		else
		System.out.println("Second Element Not Found");
		
		
	
	return 0;
}
public static void main(String arg[])
      {
	int a[]= {1,2,1,2,3,4,5,6,7,8,9};
	Check_Tow_int ss=new Check_Tow_int();
	ss.input(a);
		}
}
