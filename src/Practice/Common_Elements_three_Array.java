//Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
package Practice;

public class Common_Elements_three_Array {
	
		int []a= {1,2,3,4,6};
		int b[]= {3,4,5,6,7};
		int c[]= {6,4,7,8,9};
		int i,j,k;
		
		Common_Elements_three_Array()
		{
			for(i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			for(i=0;i<a.length;i++)
			{
				System.out.print(b[i]+" ");
			}
			System.out.println();
			for(i=0;i<a.length;i++)
			{
				System.out.print(c[i]+" ");
			}
			System.out.println();
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
					for(k=0;k<a.length;k++)
					{
						if(a[i]==b[j] && b[j]==c[k] )
						{
							
								System.out.println(a[i]);
							
						}
					}
				}
			}
		}
		public static void main(String[] args) {
			Common_Elements_three_Array ob=new  Common_Elements_three_Array();
		}

}
