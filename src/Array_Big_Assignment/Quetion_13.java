//Q13.Wap enter an array and print the square of the element which is on odd position.

package Array_Big_Assignment;

public class Quetion_13 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int c=0;
	public void replace() {
		for (i = 0; i < a.length; i=i+2) 
		{
		
				a[i]=a[i]*a[i];
			
				System.out.println(a[i]+" ");
			
		}
		
		
	}
	public static void main(String[] args) {
		Quetion_13 ss=new Quetion_13 ();
		ss.replace();
	}
}
