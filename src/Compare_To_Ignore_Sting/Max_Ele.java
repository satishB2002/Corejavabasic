package Compare_To_Ignore_Sting;

import String.intern_method;

public class Max_Ele {
public static void main(String[] args) {
	int	a[]= {45,63,21,45,78,96,35};
	int	i,j,t=0;
	for ( i = 0; i < a.length; i++) {
		for ( j = i+1; j < a.length; j++) {
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	System.out.println("Max Ele="+a[a.length-1]);
}
}
