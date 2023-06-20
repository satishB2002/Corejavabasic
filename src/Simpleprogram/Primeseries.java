package Simpleprogram;

public class Primeseries
{
	public static void main(String arg[])
	{
		int num=121;
		int k=1;
		int temp=0;
			
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			temp=num+1;
		}
		if(temp==0)
		{
			System.out.println(num+"    It is Prime");
		}
		else
		{
			System.out.println(num+"     It is Not Prime");
		}
	}

}
