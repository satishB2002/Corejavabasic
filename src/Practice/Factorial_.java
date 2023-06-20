package Practice;

public class Factorial_ {
public static void main(String[] args) {
	int a=100;
	for (int i = 1; i <=a; i++) {
		if(a%i==0)
		{
		int j=2;
		int t=0;
		while(i>j)
		{
			if(i%j==0)
				t=t+1;
			j++;
			
		}
		if(t==0)
		{
			System.out.println(i);
		}
		}
	}
}
}
