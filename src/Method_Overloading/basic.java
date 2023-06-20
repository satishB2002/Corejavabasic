package Method_Overloading;
 class start
{
	 public static void sum()
		{
		int	a=10,b=5;
		System.out.println("First Method is Sum"+(a+b));
		}
		public static int sum(int a)
		{
			System.out.println("Single value A="+a);
			return a;
		}
		public static double sum(int a,int b)
		{
			System.out.println(" Sum of Two="+(a+b));
			return a+b;
		}
		public static float sum(int a,float b,int c)
		{
			System.out.println(" Sum of three="+(a+b+c));
			return a+b+c;
		}
}
		
public class basic extends start {
	public static void main(String arg[])
	{
		 basic  ss=new  basic ();
		 basic.sum();
		 basic.sum(10);
		 basic.sum(10,20);
		 basic.sum(10,20,30);
		
		 
	}

}
