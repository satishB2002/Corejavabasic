package String3rdAssignment5jan.txt;
import java.util.*;
public class Non_Repeted_Char_In_String {
	String S;
	Scanner sc=new Scanner(System.in);
	int i,j,c,freq=0,min=0;
	Non_Repeted_Char_In_String ()
	{
		System.out.println("Enter Your String ");
		S=sc.nextLine();
		char []a=S.toCharArray();
		for(i=0;i<a.length;i++)
		{
			c=1;
			for(j=0;j<a.length;j++)
			{
				if(a[i]!=a[j])
					c++;
			}
			if(c>min)
			{
				min=c;
				freq=a[i];
				
			}
			
		}
		System.out.println("Non Repeted element="+(char)freq);
		
		
		
	}
	public static void main(String arg[])
	{
		Non_Repeted_Char_In_String ss=new Non_Repeted_Char_In_String();	
	}
}
