package ReturntypewithArgumentmethod;

public class Square_Odd_Position {
	int i,j;
	public int disp(int a[])
	{
		for(i=0;i<a.length;i=i+2)
		{
			a[i]=a[i]*a[i];
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		Square_Odd_Position ss=new Square_Odd_Position();
		ss.disp(a);
	}

}
