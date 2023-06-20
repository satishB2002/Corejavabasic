package Practice;

public class Sum_of_n_Digit_no {
public static void main(String[] args) {
	int n=123456;
	int t=n;
	int rem;
	int largest=9;
	int smallest=0;
	int sum=0;
	while(t!=0)
	{
		rem=t%10;
		
		sum=sum+rem;
		
		t=t/10;
	}
	System.out.println("Sum is="+sum);
	
}
}
