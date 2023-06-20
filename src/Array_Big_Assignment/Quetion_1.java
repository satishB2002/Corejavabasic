//Q1.Wap to input an array and find 
 // no of 0s.
 // no of positive no.
//  no of negative no.
package Array_Big_Assignment;

public class Quetion_1 {
	int i,j;
	int a[]= {1,0,2,3,4,-3,-9,-6,0};
	int c,k=0,t=0;
	public void result() {
		c=0;
		k=0;
		t=0;
		for ( i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				c++;
				
			}
			if(a[i]>0)
			{
				k++;
				
			}
			if(a[i]<0)
			{
				t++;
				
			}
		}
		System.out.println("NO of Zeros=="+c);
		System.out.println("NO of Positive=="+k);
		System.out.println("NO of Negative=="+t);
		
	
	
}
public static void main(String[] args) {
	Quetion_1  ss=new Quetion_1 ();
	ss.result();
}
}
