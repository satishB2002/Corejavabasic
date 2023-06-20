package Practice_Most;

public class Divisible_by_two {
	public static int  Printfact(int n)
	{
		if(n==1 ||n==0)
		{
		return 1;
		}
		int fact_nm1=Printfact(n-1);
		int fact_n =n* fact_nm1;
		return fact_n;
	}
public static void main(String[] args) {
	int n=5;
	int ans= Printfact(5);
	System.out.println(ans);
}
}
