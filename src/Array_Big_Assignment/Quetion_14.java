//Q14.Wap enter an array and print the  square of the element which is on even position.

package Array_Big_Assignment;

public class Quetion_14 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int c=0;
	public void replace() {
		for (i = 1; i < a.length; i=i+2) 
		{
		
				a[i]=a[i]*a[i];
			
				System.out.println(a[i]+" ");
			
		}
		
		
	}
	public static void main(String[] args) {
		Quetion_14 ss=new Quetion_14 ();
		ss.replace();
	}
}
