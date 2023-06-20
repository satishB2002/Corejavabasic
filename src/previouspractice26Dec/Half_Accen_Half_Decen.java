/*Q11.Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,10,66,22,19,11,10},*/
package previouspractice26Dec;
import java.util.*;
public class Half_Accen_Half_Decen {
	int i,j,t;
	Scanner sc=new Scanner(System.in);
	public int disp(int a[])
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
					
			}
		}
		int n=a.length/2;
		for(i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}
		for(i=0;i<=n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(i=a.length-1;i>=n;i--)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {9,1,3,5,6,11,22,66,10,19};
		Half_Accen_Half_Decen ss=new Half_Accen_Half_Decen();
		ss.disp(a);
		
	}

}
