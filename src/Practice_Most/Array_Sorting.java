package Practice_Most;
import java.util.*;
public class Array_Sorting {
int i,j,t;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
public void input() {
	System.out.println("Enter Your Arry");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		}
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	System.out.println("Smallest="+a[a.length-1]);
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
}
public static void main(String[] args) {
	Array_Sorting ss=new Array_Sorting();
	ss.input();
}
}
