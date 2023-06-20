/*Q4.Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,10,66,22,19,11,10},*/
package mixpractice3jan.txt;

public class Half_accen_Half_decc implements Accen_deccen {

	int i,j,t;
	int a[]= {9,1,3,5,6,11,22,66,10,19};
	public void half() {
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
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
	public static void main(String arg[])
	{
		Half_accen_Half_decc ss=new Half_accen_Half_decc();
		ss.half();
	}
}
