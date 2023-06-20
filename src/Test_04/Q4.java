package Test_04;
/*Q.4 .How to merge two sorted or unsorted arrays into a single sorted array
without duplicates in Java?*/

public class Q4 {
	
public static void input() {
	int a[]= {1,2,3,4,5,6,7};
	int b[]= {77,55,66,33,44,11};
	int size =a.length+b.length;
	int c[]=new int [size];
	for (int i = 0; i <a.length; i++) {
		c[i]=a[i];
		
	}
	for (int i = 0; i <b.length; i++) {
		c[i+a.length]=b[i];
		
	}
	int t=0;
	for (int i = 0; i < c.length; i++) {
		for (int j =i+1; j < c.length; j++) {
			if(c[i]>c[j])
			{
			t=c[i];
			c[i]=c[j];
			c[j]=t;
			}
			
		}
		
	}
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+" ");
	}
	
}
public static void main(String[] args) {
	Q4 ss=new Q4();
	ss.input();
}
}
