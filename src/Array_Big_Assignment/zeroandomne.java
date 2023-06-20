package Array_Big_Assignment;

public class zeroandomne {
public static void main(String[] args) {
	int a[]= {1,0,0,1,4,5,6,2,0,0,0,1,1};
	int i,j,c=0;
	for(i=0;i<a.length;i++)
	{
		int k=0;
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				k=a[i];
				a[i]=a[j];
				a[j]=k;
			}
		}
	}
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	System.out.println();
	for(i=0;i<a.length;i++)
	{
		if(a[i]==0)
			c++;
			
	}
	int t=0;
	for(i=c;i<a.length;i++)
	{t=0;
	for(j=i+1;j<a.length;j++)
	{
		if(a[i]<a[j])
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
}
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
}
}
