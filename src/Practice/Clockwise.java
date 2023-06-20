package Practice;

public class Clockwise {
	int i,j,x;
	int a[]= {1,2,3,4,5};
		Clockwise()
		{
			x=a[a.length-1];
			for(i=a.length-2;i>=0;i--)
			{
				a[i+1]=a[i];
			}
			a[0]=x;
			for(i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
		}
		public static void main(String arg[])
		{
			Clockwise sc=new Clockwise();
		}
	
}
