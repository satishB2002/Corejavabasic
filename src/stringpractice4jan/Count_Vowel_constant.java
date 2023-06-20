//5.enter a string and count the no of vowel and consonent.
package stringpractice4jan;
import java.util.*;
public class Count_Vowel_constant {
	static int i,j;
	static String Str;
	static int c=0,k=0;
	static Scanner sc=new Scanner(System.in);
	public static void input()
	{
		System.out.println("Enter your String");
		Str=sc.nextLine();
		for(i=0;i<Str.length();i++)
		{
			if(Str.charAt(i)=='a'||Str.charAt(i)=='e'||Str.charAt(i)=='i'||Str.charAt(i)=='o'||Str.charAt(i)=='u'||Str.charAt(i)=='A'||Str.charAt(i)=='E'||Str.charAt(i)=='I'||Str.charAt(i)=='O'||Str.charAt(i)=='U')
			{
				c++;
			}
			else
			{
				k++;
			}
		}
		System.out.println("Count of Vowels="+c);
		System.out.println("Count of Constant="+k);
		
	}
	public static void main(String arg[])
	{
		input();
	}

}
