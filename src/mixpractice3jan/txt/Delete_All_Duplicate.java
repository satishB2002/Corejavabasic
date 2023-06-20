package mixpractice3jan.txt;
import java.util.*;
public class Delete_All_Duplicate {
	int i,j,v=-1,c;
	int a[]=new int[10];
	int b[]=new int[a.length];
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Your Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			c=1;
			for(j=i+1;j<a.length;j++)
			{
			     if(a[i]==a[j])
		       	{
				b[j]=v;
				c++;
				
			     }
			  }
			if(b[i]!=v)
			{
				b[i]=c;
			}
		}
		System.out.println("All duplicate delete");
		for(i=0;i<a.length;i++)
		{
			if(b[i]!=v)
			{
				System.out.println(a[i]+" ");
			}
		}
		
	}
	public static void main(String arg[])
	{
		Delete_All_Duplicate aa=new Delete_All_Duplicate();
		aa.input();
	}

}
