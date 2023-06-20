/*Q10.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}*/
package previouspractice26Dec;
import java.util.*;
public class One_By_One_Merging_Two_array {
	int i,j;
	int l=0,m=1;
	Scanner sc=new Scanner(System.in);
	
	public int disp(int a[],int b[],int c[])
	{
		for(i=0;i<a.length;i++)
		{
			c[l]=a[i];
			l=l+2;
		}
		for(i=b.length-1;i>=0;i--)
		{
			c[m]=b[i];
			m=m+2;
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
		int size=a.length+b.length;
		int c[]=new int[size];
		One_By_One_Merging_Two_array ss=new One_By_One_Merging_Two_array();
		
		ss.disp(a,b,c);
		}
}
