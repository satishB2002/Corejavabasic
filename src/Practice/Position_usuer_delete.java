/*Q2.Wap input an array now delete  element from array, position is taken from user.*/
package Practice;
import java.util.*;
public class Position_usuer_delete {
	int i,j,pos;
	Scanner sc=new Scanner(System.in);
	public int input1(int a[])
			{
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return 0;
			}
	public int  display(int a[])
	{
		System.out.println("Enter your Position");
		pos=sc.nextInt();
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]==pos)
			{
				for(j=i+1;j<a.length;j++)
				{
					a[j-1]=a[j];
				}
			}
		}
		return 0;
	}
	public int result(int a[])
	{
		for(i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]=new int[10];
		Position_usuer_delete sb=new Position_usuer_delete();
		sb.input1(a);
		sb.display(a);
		sb.result(a);
	}
	

}

