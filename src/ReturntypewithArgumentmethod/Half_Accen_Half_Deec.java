//Q14.Wap sort half array in accending and half in decending order
  //  input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    //output={1,3,5,6,9,10,66,22,19,11,10},
package ReturntypewithArgumentmethod;

public class Half_Accen_Half_Deec {
	int i,j,t;
	public int input(int a[],int b[])
	{
		for(i=0;i<a.length/2;i++)
		{
			for(j=i+1;j<a.length/2;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=0;i<a.length/2;i++)
		{
			b[i]=a[i];
		}
		
		for(i=a.length/2;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=a.length/2;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(i=0;i<a.length;i++)
		{
		System.out.println(+a[i]+" ");
		}
			
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {9,1,3,5,6,11,22,66,10,19};
		int b[]=new int[a.length];
		
		
		Half_Accen_Half_Deec aa=new Half_Accen_Half_Deec ();
		aa.input(a,b);
	}

}
