package MixArraypattern_20_22;

public class Number_Pattern_3 {
int i,j;
Number_Pattern_3()
{
	for(i=5;i>=1;i--)
	{
		for(j=i;j>=1;j--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
public static void main(String arg[])
{
	Number_Pattern_3 sc=new Number_Pattern_3();
}
}
