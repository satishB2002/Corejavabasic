/*Q9. WAP to replace all negative value with its immediate left elements square. Means 
     arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
     Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].*/
package ReturntypewithArgumentmethod;

public class Negative_Left_Square {
	int i;
	public int disp(int a[])
	{
		for(i=0;i<a.length;i++) 
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
				
			}
			
			
		}
		for(i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+" ");
		}
		
		
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {12, 3, -19, 29, 5, -61, 44, 7, -9};
		Negative_Left_Square  ss=new Negative_Left_Square ();
		ss.disp(a);
	}

}
