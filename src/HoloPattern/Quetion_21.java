package HoloPattern;

public class Quetion_21 {
public static void main(String[] args) {
	int i,j;
	for(i=1;i<=9;i++)
	{
		for(j=i+1;j<=9;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			if((i==1||j==1||i==j) && i%2!=0)
			{
			System.out.print(" *");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	for(i=8;i>=1;i--)
	{
		for(j=i+1;j<=8;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			if((i==1||j==1||i==j) && i%2!=0)
			{
			System.out.print(" *");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
