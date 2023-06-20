package Practice;
import java.util.*;
public class Duplicate_element {
public static void main(String arg[])
{
	Scanner sc =new Scanner(System.in);
	int i,j;
	int a[]=new int[10];
	System.out.println(" Enter Your element");
	for (i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.print(a[j]+" ");
				
			}
		}
	}
}
}
