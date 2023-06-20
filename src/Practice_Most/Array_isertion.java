package Practice_Most;
import java.util.*;
public class Array_isertion {
Scanner sc=new Scanner(System.in);
int i,j;
int n=10;
int a[]=new int[n+1];
public void input() {
	System.out.println("Enter Your Array"); 
	for(i=0;i<a.length;i++)
	{
	a[i]=sc.nextInt();
	
	}
	int pos=5;
	System.out.println("You Want Enter Your insert element");
	int ele=sc.nextInt();
	for(i=a.length-1;i>=pos-1;i--)
	{
		a[i]=a[i-1];
	}
	a[pos-1]=ele; 
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
}
public static void main(String[] args) {
	Array_isertion  ss=new Array_isertion ();
	ss.input();
}
}
