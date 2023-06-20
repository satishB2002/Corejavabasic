package Assignment_27_02;
//Q1.Write a Java program to find lowest frequency character in 
//a string.

public class Q1 {
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
	for ( i = 0; i < b.length; i++) {
		if (b[i]!=v) 
		{
			System.out.println(a[i]+" "+b[i]);
		}
	}
}
}
