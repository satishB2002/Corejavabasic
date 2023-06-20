package HoloPattern;

public class Patern_21 {
	Patern_21 ()
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=i+1;j<=9;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if((i==1||j==1|i==j)&& i%2!=0)
					System.out.print(" *");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
	public void display()
	{
		{
			int i,j;
			for(i=8;i>=1;i--)
			{
				for(j=i+1;j<=9;j++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=i;j++)
				{
					if((i==1||j==1|i==j)&& i%2!=0)
						System.out.print(" *");
					else
						System.out.print("  ");
					
				}
				System.out.println();
			}
		}
	}
	public static void main(String arg[])
	{
		Patern_21  sc=new Patern_21 ();
		sc.display();
	}
}
