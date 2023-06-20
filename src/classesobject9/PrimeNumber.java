package classesobject9;
/*Q10) Wap to check Prime Number Program in Java*/

public class PrimeNumber {
	int num=12;
	int temp=0;
	
	public void input()
	{
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			temp=num+1;
		}
		if(temp==0)
			System.out.println(num+"   The Number is Prime");
		else
			System.out.println(num+"   The number is Not Prime");
	}
	public static void main(String arg[])
	{
		PrimeNumber sc=new PrimeNumber();
		sc.input();
	}

}
