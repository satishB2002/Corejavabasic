package Practice;

import String.intern_method;

public class majority {
public static void main(String[] args) {
	int a[]= {1,2,3,4,6,4,4,4};
	int n=a.length;
	int	c=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
				c++;
			}
		}
		if(c>=a.length/2)
		{
			System.out.println("Majority Element="+a[i]);
			break;
		}
	}
}
}
