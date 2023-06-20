/*Q15.Given an array and a number K where K is smaller than the size of the array. 
   Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7*/
package ReturntypewithArgumentmethod;

public class Smallest_k {
int i,j,t,k;
public int input(int arr[])
{
	k=3;
	for(i=0;i<arr.length;i++)
	{
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
			t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			}
		}
		
	}
	System.out.println("Smallest K="+arr[k-1]);
	

	
	return 0;
}
public static void main(String arg[])
{
	int arr[] = {7, 10, 4, 3, 20, 15};
	Smallest_k aa=new Smallest_k();
	aa.input(arr);
}
}
