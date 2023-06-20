//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
package Array_Big_Assignment;

public class ZeroEndOfArray {
	
	public static void main(String[] args) {
		int a[]= {0,1,0,2,0};
		int i,j2,k,t=0;
		for ( j2 = 0; j2 < a.length; j2++) {
			for ( k =j2+1; k < a.length; k++) {
				if(a[j2]<a[k])
				{
					t=a[j2];
					a[j2]=a[k];
					a[k]=t;
					
				}
			}
			for ( j2 = 0; j2 < a.length; j2++) {
				System.out.println(a[j2]+" ");
			}
			int c=0;
			for ( j2 = 0; j2 < a.length; j2++) {
				if(a[j2]==0)
					c++;
			}
			
			
		}
		
		}
	
}