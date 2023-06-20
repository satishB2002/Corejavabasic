package Array_Pattern;

public class patteren_Q1 {
	int i,j;
	patteren_Q1()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==5||j==1||i==j)
				System.out.print(" *");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		patteren_Q1 sc=new patteren_Q1 ();
	}

}
