package HoloPattern;

import String.intern_method;

public class number_1 {
public static void main(String[] args) {
	int m=0;
	for (int i = 1; i <=5; i++) {
		m=1;
		for (int j = 1; j <=i; j++) {
			System.out.print(" "+m);
			if(j==1)
			{
			m=m;
			}
			else 
				{
					m=m+1;
				}
			if(j==4)
			{
				m=m+1;
			}
			
		}
		System.out.println();
	}
}
}
