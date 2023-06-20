package Practice;
import java.util.*;
public class Aremstrong_Series_With_Rturn_With_arg {
int i,j,t,sum,rev,c,k,rem;
public int input(int n)
{
	k=1;
	for(i=k;i<=n;i++)
	{
		t=0;
		
		for(j=2;j<i-1;j++)
		{
			if(i%j==0)
			t=n+1;
			
		}
		if(t==0)
		{
			System.out.println(i+" ");
		}
	}
	return 0;
	
	
}
public static void main(String arg[])
{
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter Your Last Range");
	int n=ss.nextInt();
	Aremstrong_Series_With_Rturn_With_arg sc=new Aremstrong_Series_With_Rturn_With_arg();
	sc.input(n);
}
}
