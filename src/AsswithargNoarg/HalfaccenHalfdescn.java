package AsswithargNoarg;
/*Q14.Wap sort half array in accending and half in decending order
input= int [] a={9,1,3,5,6,11,22,66,10,19}.
output={1,3,5,6,9,10,66,22,19,11,10},*/
public class HalfaccenHalfdescn {
	int i,j,t;
public void input(int a[],int b[])
{
	for(i=0;i<a.length/2;i++)
	{
		for(j=i+1;j<a.length/2;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
		}
	}
	for(i=0;i<a.length/2;i++)
	{
		b[i]=a[i];
	}
	
}

public void input2(int a[],int b[])
{
	for(i=(a.length/2);i<a.length;i++)
	{
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
	for(i=a.length/2;i<a.length;i++)
	{
		b[i]=a[i];
	}
	
}

public void display(int []a,int b[])
{
	for(i=a.length/2;i<a.length;i++)
	{
	System.out.print(b[i]+" ");	
	}
}
public static void main(String arg[])
{
	int a[] ={9,1,3,5,6,11,22,66,10,19};
	int b[]=new int[a.length];
	HalfaccenHalfdescn ob=new HalfaccenHalfdescn();
	ob.input(a,b);
	ob.input2(a, b);
	ob.display(a, b);
	
			

}
}