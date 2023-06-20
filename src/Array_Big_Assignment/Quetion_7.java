//Q7.Wap enter an array and find the sum and count of element present at even position.

package Array_Big_Assignment;

public class Quetion_7 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9};
	int c=0,sum=0;
	public void even_pos() {
		for (i = 0; i < a.length; i=i+2) 
		{
			
			sum=sum+a[i];
			c++;
			
		}
		System.out.println("Sum Of Even Pos="+sum);
        System.out.println("Count Of Even pos ="+c);
		
	}
	public static void main(String[] args) {
		Quetion_7 ss=new Quetion_7 ();
		ss.even_pos();
	}
}
