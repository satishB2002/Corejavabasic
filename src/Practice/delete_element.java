/*Q1.Wap input an array now delete  element from array, element is taken from user.*/

package Practice;
import java.util.*;

public class delete_element {
	int i,j,ele;
	Scanner sc=new Scanner(System.in);
public int input(int a[])
{
	System.out.println("Enter array element");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	return 0;
	
}
public int delete(int a[])
{
	System.out.println("enter elemet you want to delete");
	ele=sc.nextInt();
	for(i=0;i<a.length-1;i++)
	{
		if(a[i]==ele)
		{
			for(j=i+1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			
		}
	}
	return 0;
}
public int disply(int a[])
{
	
	for(i=0;i<a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
	return 0;
}
public static void main(String arg[])
{
	int a[]=new int[5];
	delete_element sb=new delete_element();
	sb.input(a);
	sb.delete(a);
	sb. disply(a);
}
}
