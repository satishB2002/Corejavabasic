//Q8.Write a program  enter an array and find sum of  first and third element .
package interface_practce_ass;

public class Sum_1 implements Sum_3{
	int i,j,sum;
	int a[]= {1,2,3,4,5};

	@Override
	public void sum() {
		sum=0;
		System.out.println("Your array");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	sum=a[0]+a[2];
	System.out.println("Sum Of First and Third=="+sum);
		
	}
	public static void main(String arg[])
	{
		Sum_1 ss=new Sum_1();
		ss. sum() ;
	}

}
