package Array_Big_Assignment;

public class ZeroLeftOneRight {
public static void main(String[] args) {
	int a[]= {1,0,3,4,0,9,1,7,1,1,0,3};
	int i,j;
	int t=0;
	for ( i = 0; i < a.length; i++) {
		for ( j =i+1; j < a.length; j++) {
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
			
		}
	}
	
	int c=0;
	for(i=0;i<a.length;i++)
	{
		if(a[i]==0)
			c++;
	}
	for ( i = c; i < a.length; i++) {
		for ( j =i+1; j < a.length; j++) {
			if(a[i]<a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
			
		}
	}
	
	for ( i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
}
}
