//Q4.Wap to input an array and and print the  sum and count of odd  no.
package Array_Big_Assignment;

public class Quetion_4 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9};
	int sum=0,c=0;
	
	public void odd() {
		for (i = 0; i < a.length; i++) {
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
				c++;
			}
			
		}
		System.out.println("Sum of odd no="+sum);
		System.out.println("Count  of odd no="+c);
		
	}
	public static void main(String[] args) {
		Quetion_4 ss=new Quetion_4();
		ss.odd();
	}

}
