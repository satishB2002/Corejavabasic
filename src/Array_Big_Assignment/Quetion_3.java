//Q3.Wap to input an array and and print the  sum and count of  even no.

package Array_Big_Assignment;

public class Quetion_3 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9};
	int sum=0,c=0;
	
	public void even() {
		for (i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				c++;
			}
			
		}
		System.out.println("Sum of even no="+sum);
		System.out.println("Count  of even no="+c);
		
	}
	public static void main(String[] args) {
		Quetion_3 ss=new Quetion_3();
		ss.even();
	}

}
