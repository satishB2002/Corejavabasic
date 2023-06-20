package AsswithargNoarg;
import java.util.*;
public class Arrayprime {
	int j;
	Scanner sc=new Scanner(System.in);

	public void input(int a[])
	{
		System.out.println("Enter array element");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
		 public void display(int a[])
		 {
		for(int i=0;i<a.length;i++)
		{
			for( j=2;i<a[i];j++)
			{
				if(a[i]%j==0)
				break;	
			}
			if(a[i]==j)
				System.out.print(a[i]+" ");
		}
		
	}
	
	public void main()
	{
		
		
		int a[]=new int[10];
		Arrayprime sc=new Arrayprime();
		sc.input(a);
		sc.display(a);
				
	}

}
