package AsswithargNoarg;
/*Q10.Java Program to print the  square of the elements of an array present on odd position.*/

public class oddpositionsquare {
	int i;
	public void main(int a[])
	{
		for( i=0;i<a.length;i=i+2)
		{
			
				a[i]=a[i]*a[i];
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		oddpositionsquare sc=new oddpositionsquare();
		sc.main(a);
	}

}
