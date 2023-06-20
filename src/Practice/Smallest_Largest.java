package Practice;

public class Smallest_Largest {
public static void main(String[] args) {
	int n=123456;
	int t;
	int rem;
	int smallest=0;
	int largest=9;
	for (int i =n;i!=0;i=i/10) {
		rem=i%10;
		smallest=Math.min(rem, n);
		largest=Math.max(rem,n);
			}
	
	System.out.println("Smallest Ele="+smallest);
	System.out.println("Largest Ele="+largest);

	
}
}
