package Assignment_27_02;
//Q1.Write a Java program to find lowest frequency character in 
//a string.

import String.intern_method;
public class Q_First {
	public static void main(String[] args) {
	
	int	i,j;
	int	c=0;
	int v=-1;
	String	s="My Name Is Satish";
	char a[]=s.toCharArray();
	int	b[]=new int[a.length];
	for ( i = 0; i < a.length; i++)
	{
		c=1;
		for ( j =i+1; j < a.length; j++)
		{
			if (a[i]==a[j]) 
			{
				b[j]=v;
				c++;
			}
		}
		if (b[i]!=v) 
			b[i]=c;
		
	}
	int ele=a[0];
	int eleco=b[0];
	for ( i = 0; i < a.length; i++) {
		if (b[i]<ele && b[i]>0) {
			ele=a[i];
			eleco=b[i];
			
		}
	
	}
	System.out.println("Lowest Frequency Chracter="+(char)ele);
}
	}

