//18 Wap enter a string and the duplicate  character  in string.
package String;
import java.util.*;
public class Duplicate_character {
	static String Hil;
	static int i,j;
	static Scanner kk=new Scanner(System.in);
	public static void input()
	{
		System.out.println("Enter String");
		Hil=kk.nextLine();
		char a[]=Hil.toCharArray();
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.print(a[j]+" ");
					
				}
			}
			
			
		}
	}
	
		public static void main(String arg[])
		{
			input();
			}
	
}
