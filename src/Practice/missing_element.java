package Practice;

public class missing_element {
	public static void main(String arg[])
	{
	int [] a={1,2,3,4,5,6,8};
	int n=a.length+1;
	int total_sum=(n*(n+1)/2);
	int i,j;
	int sum=0;
	for(i=0;i<a.length;i++)
			{
			sum=sum+a[i];
			}
			System.out.println("missing number="+(total_sum-sum));
		}
	}

