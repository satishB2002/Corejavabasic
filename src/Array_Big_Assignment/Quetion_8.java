//Q8.Wap enter an array and find the sum and count of odd position .

package Array_Big_Assignment;

public class Quetion_8 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9};
	int c=0,sum=0;
	public void odd_pos() {
		for (i = 1; i < a.length; i=i+2) 
		{
			
			sum=sum+a[i];
			c++;
			
		}
		System.out.println("Sum of Odd=-"+sum);
        System.out.println("Count Of ODD pos ="+c);
		
	}
	public static void main(String[] args) {
		Quetion_8  ss=new Quetion_8 ();
		ss.odd_pos();
	}


}
