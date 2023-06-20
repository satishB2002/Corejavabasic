package Practice;

public class missing_no_ {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,7,8,9};
	int n=a.length+1;
	int total_sum=(n*(n+1)/2);
	int sum=0;
	for (int i = 0; i <a.length; i++) {
		sum=sum+a[i];
	}
	System.out.println(total_sum-sum);
	
}
}
