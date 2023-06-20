//Q5.Wap input an array now delete  element from array, element is taken from user.
package mixpractice3jan.txt;
import java.util.*;
public class Delete_Element_Array {
int i,j;
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter Your Delete Element");
	int ele=sc.nextInt();
	for(i=0;i<a.length;i++)
	{
      if(a[i]==ele)
      {
		for(j=i+1;j<a.length;j++)
		 
		{
			a[j-1]=a[j];
		}
	}
	}
	
	for(i=0;i<a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
}
public static void main(String arg[])
{
	Delete_Element_Array ss=new Delete_Element_Array();
	ss.input();
}
		
}
