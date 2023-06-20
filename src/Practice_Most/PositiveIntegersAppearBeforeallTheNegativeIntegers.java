package Practice_Most;
/*Write a Java program to arrange the elements of a given array 
of integers where all positive integers appear before all the 
negative integers*/
public class PositiveIntegersAppearBeforeallTheNegativeIntegers {
public void name() {
	int a[]= {1,-2,3,-55,-7,9,7};
	int i,j;
	int c=0;
	
int t=0;
	for ( i = c; i < a.length; i++) {
		for ( j = i+1; j < a.length; j++) {
			if(a[i]<a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		
	}
	System.out.println("all positive integers appear before all the \r\n"
			+ "negative integers");
	for ( i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
}
public static void main(String[] args) {
	PositiveIntegersAppearBeforeallTheNegativeIntegers ss=new PositiveIntegersAppearBeforeallTheNegativeIntegers();
	ss.name();
}
}
