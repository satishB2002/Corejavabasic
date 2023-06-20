package String;

import java.util.Collections;


import HoloPattern.SATISH;

//2] Print a string that given but every alphabet given in a string should be print only for once in a uppercase
public class dup_Uppper {
public static void main(String[] args) {
	String string="Satish Barate In pune";
	String S1=string.toLowerCase();
	char a[]=S1.toCharArray();
	
	int c;
	for (int i = 0; i < a.length; i++) 
	{
		c=0;
		for (int j = i+1; j < a.length; j++) 
		{
			
			if (a[i]==a[j]) {
				{
					
					c++;
					
				}
				
			}
		}
			if(c==0)
			{
				//System.out.println(a[i]);
				String S2=Character.toString(a[i]);
				System.out.print(S2.toUpperCase());
				
			}
			
			
	
		
	
}
}
}