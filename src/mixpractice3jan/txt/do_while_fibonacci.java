//Q3.write a program to print fibonacci series using do while.
package mixpractice3jan.txt;

public class do_while_fibonacci {
	do_while_fibonacci()
	{
	int i,j,n, n1=0,n2=1,n3;
	i=1;
	n=10;
	do
	{
	n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.println(n3+" ");
	i++;
	}while(i<n);
	
	}
	public static void main(String arg[])
	{
		do_while_fibonacci ss=new do_while_fibonacci();
		
	}

}
