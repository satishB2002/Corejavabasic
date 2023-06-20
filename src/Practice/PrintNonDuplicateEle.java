package Practice;

import String.intern_method;

//Print Non Duplicate Element
public class PrintNonDuplicateEle {
public static void main(String[] args) {
	int	 a[]= {1,1,1,2,3,4,5,8,5,6,3,5,6};
	for (int i = 0; i < a.length; i++) {
		 int c=0;
		for (int j =0; j < a.length; j++) {
			if (a[i]==a[j])
			{
			c++;
			}
		}
		if(c==1)
			System.out.println(a[i]);
	}
}
}
