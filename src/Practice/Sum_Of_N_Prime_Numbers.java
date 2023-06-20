package Practice;
//Q2. Write a java program to find the sum of initial ‘n‘ prime numbers?

public class Sum_Of_N_Prime_Numbers {
	
public void name() {
	int i,j,temp,sum=0;
	for (int j2 =1; j2 <=100; j2++) {
		temp=0;
		for (int k =2; k <j2-1; k++) {
			if(j2%k==0)
			temp=temp+1;
			
			
		}
		if(temp==0)
			System.out.println(j2+" ");
		sum=sum+j2;
		
	}
	System.out.println("Sum of N Prime Numbers="+sum);
	
}
public static void main(String[] args) {
	Sum_Of_N_Prime_Numbers ss=new Sum_Of_N_Prime_Numbers();
	ss.name();
}
}
