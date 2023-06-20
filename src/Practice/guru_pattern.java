package Practice;

import String.intern_method;

/*
a
B c
D e F
g H i J
k L m N o
*/
public class guru_pattern {
public static void main(String[] args) {
	char a='A';
	int	c=0;
	
	for (int i = 1; i <=5; i++) 
	{
		
		for (int j =1; j <=i; j++)
		{
			if(c%2!=0)
			{
				System.out.print(a+" ");
				
			}
				else
			{
              System.out.print((char)(a+32)+" ");
             
 			}
			c++;
 		}
 		
		System.out.println();
	}
}
}
