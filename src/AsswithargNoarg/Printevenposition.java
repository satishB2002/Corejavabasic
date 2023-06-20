package AsswithargNoarg;

public class Printevenposition {
	public void input(int a[])
	{
		for(int i=1;i<a.length;i=i+2)
		{
				System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		Printevenposition sc=new Printevenposition();
		sc.input(a);
	}

}
