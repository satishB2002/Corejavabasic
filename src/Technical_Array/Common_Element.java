package Technical_Array;

import java.util.Iterator;

public class Common_Element {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	int b[]= {4,5,6,7,8,9,10};
	int c=0,Count=0,Comm=0;
	for (int i = 0; i < b.length; i++) {
		for (int j =i+1; j < b.length; j++) {
			if(a[i]==b[i])
			{
				
				c++;
				
			}
		}
		if(Count>c)
		{
			Count=c;
			Comm=a[i];
			System.out.println(Comm);
		}
	}
	
}
}
