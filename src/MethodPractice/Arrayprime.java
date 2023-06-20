package MethodPractice;

public class Arrayprime {
	public boolean Checkprime(int n)
	{
		int temp=0;
		 
		for(int i=2;i<n-1;i++)
			{
				if(n%i==0)
				temp=n+1;
			}
			if(temp==0)
				return true;
			else
				return false;
		
		
		
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		Arrayprime sc=new Arrayprime();
		for(int i=0;i<a.length;i++)
		{
			if(sc.Checkprime(i));
			System.out.println(i+" ");
			
		}
		
	}

}
