package AssClassloaderwithMethod;
/*Q10.initialise 3*3 matrix and print the element with its index value.*/
public class quetion_10 {
	quetion_10 ()
	{
		int i,j;
		int [][]a= {
				   {1,2,3},
				   {4,5,6},
				   {7,8,9}
		           
					};
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		System.out.println("Element With Its Index Value");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" "+" "+i+" "+" "+j );
			}
			
			System.out.println();
		}
	}
		public static void main(String arg[])
		{
			quetion_10 sc = new quetion_10();
		}
	
}
