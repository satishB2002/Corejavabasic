//Q2.Wap to input an array and find its average of first 5 element.
package Array_Big_Assignment;

public class Quetion_2 {
	int i,j;
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0,avg;
 public  void average() {
	for ( i = 0; i < a.length; i++) {
		sum=a[0]+a[1]+a[2]+a[3]+a[4];
		
	}
	avg=sum/5;
	System.out.println("Average Of First Five="+avg);
}
public static void main(String[] args) {
	Quetion_2 ss=new Quetion_2();
	ss.average();
}
}
