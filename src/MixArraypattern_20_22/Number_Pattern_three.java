package MixArraypattern_20_22;

public class Number_Pattern_three {
int i,j;
Number_Pattern_three()
{
	for(i=5;i>=1;i--)
	{
		for(j=5;j>=i;j--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
public static void main(String arg[])
{
	Number_Pattern_three sc=new Number_Pattern_three();
}
}
