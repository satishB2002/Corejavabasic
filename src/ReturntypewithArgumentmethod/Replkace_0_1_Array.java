/*Q3. WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 
    54, 34, 10, 0, 34] */

package ReturntypewithArgumentmethod;

public class Replkace_0_1_Array
{
int i,j,t;

public int input(int a[])
{
	t=1;
	for(i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			a[i]=t;
		}
		
	
	}
	return 0;
	}

	 public static void main(String arg[])
	 {
		 int a[]= {26, 0, 67, 45, 0, 78,54, 34, 10, 0, 34};
		 Replkace_0_1_Array ss=new Replkace_0_1_Array();
		 ss.input(a);
		 for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
     }
}
