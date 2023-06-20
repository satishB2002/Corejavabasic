//Q1.Write a java program to print prime series using do while .
package mixpractice3jan.txt;

public class do_while_prime_series {
	
	public void input()
	{
		int i,j,n,temp;
		i=1;
		j=2;
		n=100;
		do
		{
			i++;
			temp=0;
			do
			{
				j++;
				if(i%j==0)
				temp=n+1;
					
			}while(j<i-1);
			if(temp==0)
				System.out.print(i+" ");
			
			
		}while(i<n);

}
	public static void main(String arg[])
	{
		do_while_prime_series ss=new do_while_prime_series();
		ss.input();
	}
}
