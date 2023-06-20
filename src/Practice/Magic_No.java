package Practice;

public class Magic_No {
public static void main(String[] args) {
int n=1234;
	int t=n;
	int rem;
	
	int sum=0;
	while(t!=0)
	{
		rem=t%10;
		
		sum=sum+rem;
		
		t=t/10;
	}
	if(sum==10 || sum==1)
	{
		System.out.println("Magical Number");
	}
	else
		System.out.println("Not Magical Number");
	
}
}
