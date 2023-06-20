package Practice;

public class Armstrong_noo {
public static void main(String[] args) {
	int n=153;
	int t=n;
	int sum=0;
	int rem;
	while(t!=0)
	{
		rem=t%10;
		sum=sum+(rem*rem*rem);
		t=t/10;
	}
	if(sum==n)
	{
		System.out.println("Arm No");
	}
	else
		System.out.println("Not Arm");
}
}
