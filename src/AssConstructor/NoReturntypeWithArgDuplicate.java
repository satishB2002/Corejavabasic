package AssConstructor;
import java.util.*;
class duplicate
{	
	Scanner sb=new Scanner(System.in);
	
public void input(int a[])
{
	int i,j;
	System.out.println("Enter Array Element");
	for(i=0;i<a.length;i++)
	{
		a[i]=sb.nextInt();
	}
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i]+" ");
			}
		}
	}
}
}
public class NoReturntypeWithArgDuplicate {
public static void main(String arg[])
{
	
	int a[]=new int[10];
	duplicate sc=new duplicate();
	sc.input(a);
}
}
