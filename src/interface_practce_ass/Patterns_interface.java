package interface_practce_ass;

public class Patterns_interface implements Pattern_interface {
	int i,j;

	@Override
	public void pattern1() {
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	@Override
	public void pattern2() {
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	@Override
	public void pattern3() {
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	@Override
	public void pattern4() {
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}

	@Override
	public void pattern5() {
		
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String  arg[])
	{
		Patterns_interface ss=new Patterns_interface();
		ss.pattern1();
		ss.pattern2();
		ss.pattern3();
		ss.pattern4();
		ss.pattern5();
			}

}
