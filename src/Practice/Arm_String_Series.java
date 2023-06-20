package Practice;

public class Arm_String_Series {
public static void main(String[] args) {
	int i,j,k,n,sum,rem,t;
	k=1;
	n=100;
	for ( i = k; i <=n; i++) {
		t=i;
		sum=0;
		
		while(t!=0)
		{
			rem=t%10;
			sum=sum+(rem*rem*rem);
			t=t/10;
			
		}
		if(sum==i)
		{
			System.out.println(i+" ");
		}
		
	}
}
}
