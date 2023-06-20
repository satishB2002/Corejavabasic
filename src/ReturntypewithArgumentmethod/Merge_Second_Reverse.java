/*Q13.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}*/
package ReturntypewithArgumentmethod;

public class Merge_Second_Reverse {
	int i,j=0,k=1;
	public int input(int a[],int b[],int c[])
	{
		for(i=0;i<a.length;i++)
		{
		    c[j]=a[i];
		 j=j+2;
		}
		       for(i=a.length-1;i>=0;i--)
	            	{
			     c[k]=b[i];
			     k=k+2;
	            	}
		
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {10,20,30,40,50};
		int b[]= {1,2,3,4,5};
		int c[]=new int[a.length+b.length];
		Merge_Second_Reverse  as=new Merge_Second_Reverse ();
		as.input(a,b,c);
	}

}
