package Practice;

import Static_Example.Max_Min;
import String.intern_method;

public class Convert_num_char {
public static void main(String[] args) {
	int	a[]= {101,256,358,967,4852,999};
	int c=0;
	
	int ans=0;
	
	for(int i = 0; i < a.length; i++) {
		int rem=0;
		int sum =0;
		
	while(a[i]>0) {//to traverse in the element 
	      
		    rem=a[i]%10; //101 1+0+1
			sum=sum+rem;
			
			a[i]=a[i]/10;
	}
	if(sum > ans) {
		ans =sum;
		
	}
	}
	}
	
	
	
}

