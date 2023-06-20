package AsswithargNoarg;
/*Q12.Wap input two array and merge in third array.*/
import java.util.*;
public class MergeArrayWithargNoreturn{
	Scanner sc=new Scanner(System.in);
int i,j;
public void ma(int a[],int b[],int c[])
{
	for(i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	for(i=0;i<b.length;i++)
	{
		c[a.length+i]=b[i];
	}
	for(i=0;i<c.length;i++)
	{
		System.out.println(c[i]+" ");
	}
	
}
public static void main(String arg[])
{
	int a[]= {1,2,3,4,5};
	int b[]= {6,7,8,9,10};
	  int size=a.length+b.length;
	int c[]=new int[size];
	MergeArrayWithargNoreturn sc=new MergeArrayWithargNoreturn();
	sc.ma(a,b,c);

}
}
