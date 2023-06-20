package Practice;

public class Armstrong_N {
public static void main(String[] args) {
	int t;
	
	int sum;
	int rem;
	int i=1;
	while(i<=500)
	{
		t=i;
	sum=0;
	while(t!=0)
	{
		rem=t%10;
		sum=sum+(rem*rem*rem);
		t=t/10;
		
	}
	if(sum==i)
	
		System.out.print(i+" ");
		
	i++;
	}
}
}
