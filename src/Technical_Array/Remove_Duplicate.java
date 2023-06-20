package Technical_Array;
//Q11.Java Program to Remove Duplicate Elements From an Array

public class Remove_Duplicate {
public static void main(String[] args) {
	int i,j; 
	int a[]= {1,2,2,4,6,6,8};
	int b[]=new int[a.length];
	int c,v=-1;
	for ( i = 0; i< a.length; i++) {
		c=1;
		for ( j =i+1; j < a.length; j++) {
			if(a[i]==a[j])
			{
				b[j]=v;
				c++;
			}
		}
		if(b[i]!=v)
		{
			b[i]=c;
			
		}
}
	for ( i = 0; i < b.length; i++) {
		if(b[i]!=v)
		{
			System.out.println(a[i]+" ");
		}
	}
}
}


