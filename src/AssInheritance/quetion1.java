package AssInheritance;
/*Q1.Java program to print EVEN and ODD elements from an array and also find the count and sum individually.*/
public class quetion1 {
	public static void main(String arg[])
	{
		even sc =new even();
		sc.disp();
		sc.disp1();
	}
}
	class even extends odd
	{
		public void disp()

		{
			int c,sum;
		int i;
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		c=0;sum=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c++;
				sum=sum+a[i];
				
			}
			
		}
		System.out.println("Sum of Even=="+sum);
		}
	
	}
	class odd 
	{
		public void disp1()

		{
			int c,sum;
		int i;
		int a[]= {1,2,3,5,6,7,8,9,10};
		c=0;sum=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				c++;
				sum=sum+a[i];
				
			}
			
		}
		System.out.println("Sum of Odd=="+sum);
		}
	
	}




