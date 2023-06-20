package Mixpracticequestion21jan.txt;

/*Q6.Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

	Examples : 

	Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
	Output : 4*/
public class Majority_Ele {
	int i,j,c;
	int a[]= {3, 3, 4, 2, 4, 4, 2, 4, 4};
	int n=a.length;
	public void name() {
		for (int i = 0; i < a.length; i++) {
			c=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
					c++;
			}
			if(c>n/2)
			{
			System.out.println(a[i]);
			
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		Majority_Ele  ss=new Majority_Ele ();
		ss.name();
		
	}
	
}
