package Practice;
import java.util.Scanner;
public class palindromeseries {
	Scanner ob=new Scanner(System.in);
	int i,n,rem;
	palindromeseries()
	{
		System.out.println(" enter the first range");
		 i=ob.nextInt();
		System.out.println(" enter the Last range");
		 n=ob.nextInt();
	}
	public void result()
	{
		while(i<=n)
		{
			int t=i;
		int	rev=0;
			while(t!=0)
			{
				rem=t%10;
				rev=rev*10+rem;
				t=t/10;
			}
			if(rev==i)
				System.out.println(i+" ");
			i++;
		}
	}
	public static void main(String[] args) {
		palindromeseries ob=new palindromeseries();
		ob.result();
	}
}
