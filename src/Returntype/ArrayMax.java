package Returntype;

public class ArrayMax {
	int a[]= {5,4,3,2,1};
	int k;
	int i ;
	
  public int maximum()
{	k=0;
	for( i=0;i<a.length;i++)
	{
		if(a[i]<k)
			{
				k=a[i];
				
				
					
			}
		
	}
	return k;
}
  public static void main(String arg[])
  {
	  ArrayMax sc=new ArrayMax ();
	  int x=sc.maximum();
	  System.out.println(x);
  }
  
}
