package perciperMaxAdd;

import String.intern_method;

public class MaxAddArray {
	public void maxArray() {
		int [] a= {142,857,999,852,3641};
		
		int rem,sum=0;
		for (int i = 0; i < a.length; i++) {
			int	t=i;
			while (t>0) {
				rem=t%10;
				sum=sum+rem;
				t=t/10;
			}
			System.out.println(sum);
		}
		
	}
public static void main(String[] args) {
	 MaxAddArray md=new  MaxAddArray();
	 md.maxArray();
}
}
