package String;

public class sum7 {
public static void main(String[] args) {
	int	 a=121;
	int rem,sum=0;
	while (a!=0 ){
		rem=a%10;
		sum=sum+rem;
		a=a/10;
	}
		System.out.print("1+2+1="+sum);
	}
}

