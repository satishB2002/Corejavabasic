package Strin_Buffer;

public class Count_White_Space {
public static void main(String[] args) {
	int i,c=0;
	String Str="Welcome to the world of technology";
	char []a=Str.toCharArray();
	for(i=0;i<a.length;i++)
	{
		if(Character.isWhitespace(a[i]))
			{
			c++;
			
		}
		
	}
	System.out.println("Count of White Spaces="+c);
	
}
}
