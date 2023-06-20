/*Java Array: Exercise-33 with Solution
Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array.*/
package Practice_Most;
//Write a Java program to find common 
//elements from three sorted (in non-decreasing order) arrays.
public class Remove_Duplicate_Ele {
	static int a[]= {1,2,3,4,5};
	static int b[]= {4,5,6,7,8};
	static int c[]= {4,5,9,6,7};
	
	static
	{
		int i,j,k;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				for(k=0;k<a.length;k++)
				{
					if(a[i]==b[j])
					{
						if(b[j]==c[k])
						{
							System.out.println(b[j]);
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
