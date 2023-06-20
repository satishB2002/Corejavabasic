//Q17.Wap enter an array and find the no in array  which is equal to the sum of 1st and last element.
//ArrayAs
package Array_Big_Assignment;

public class Quetion_17 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	public void input() {
		sum=a[0]+a[a.length-1];
		System.out.println("Sum of first last="+sum);
	}
	public static void main(String[] args) {
		Quetion_17 ss=new Quetion_17();
		ss.input();
	}

}
