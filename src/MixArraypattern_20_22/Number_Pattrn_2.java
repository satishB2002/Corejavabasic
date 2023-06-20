package MixArraypattern_20_22;

public class Number_Pattrn_2 {
	int i,j;
	Number_Pattrn_2()
	{
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	public static void main(String arg[])
	{
		Number_Pattrn_2 sc=new Number_Pattrn_2();
	}

}
