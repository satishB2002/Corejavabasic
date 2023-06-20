//Q5 Wap enter an array and print element present at odd position and also find count.

package Array_Big_Assignment;

public class Quetion_5 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9};
	int c=0;
	public void odd_pos() {
		for (i = 1; i < a.length; i=i+2) 
		{
			
			System.out.println(a[i]+" ");
			c++;
			
		}
		
        System.out.println("Count Of ODD pos ="+c);
		
	}
	public static void main(String[] args) {
		Quetion_5  ss=new Quetion_5 ();
		ss.odd_pos();
	}
}
