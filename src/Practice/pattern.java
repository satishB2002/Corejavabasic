package Practice;

public class pattern {
	int i,j;
	pattern ()
	{
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
	public static void main(String arg[])
	{
		pattern  ss=new pattern ();
	}

}
