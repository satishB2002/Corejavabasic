package Practice;

public class Missing_n {
public static void main(String[] args) {
	int i,j;
	int a[]= {1,2,3,4,5,7,8};
	int n=a.length+1;
	int sum=0;
	int total_sum=(n*(n+1)/2);
	for(i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(total_sum-sum);
}
}
