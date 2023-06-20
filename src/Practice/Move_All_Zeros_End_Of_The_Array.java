//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
package Practice;

public class Move_All_Zeros_End_Of_The_Array {
	int i,j;
	int a[]= {1,0,2,3,0,4,5,6,7,0};
	int b[]=new int[a.length];
	int l=b.length-1,m=0;
public void input() {
	for ( i = 0; i < a.length; i++)
	{
		if(a[i]==0)
		{
			b[l]=a[i];
			l--;
		}
			
	}
	for ( i = 0; i < a.length; i++)
	{
		if(a[i]!=0)
		{
			b[m]=a[i];
			m++;
		}
	}
	for ( i = 0; i < a.length; i++)
	{
		System.out.print(b[i]+" ");
	}
		
		
	
		
	
}
public static void main(String[] args) {
	Move_All_Zeros_End_Of_The_Array ok=new Move_All_Zeros_End_Of_The_Array();
	ok.input();
}
}
