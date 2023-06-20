//10.enter a string and count the no of vowel and consonent.
package String;
import java.util.*;
public class Count_vowel_Constant {
	
	 String Abc;
	Scanner sc=new Scanner(System.in);
	public  void input()
	{
		System.out.println("Enter Your String ");
		Abc =sc.nextLine();
		int k=0;
		int c=0;
		for(int i=0;i<Abc.length();i++)
		{
			if(Abc.charAt(i)=='a'||Abc.charAt(i)=='e'||Abc.charAt(i)=='i'||Abc.charAt(i)=='o'||Abc.charAt(i)=='u'||Abc.charAt(i)=='A'||Abc.charAt(i)=='E'||Abc.charAt(i)=='I'||Abc.charAt(i)=='O'||Abc.charAt(i)=='U')
			{
				c++;
			}
			else
			{
				k++;
			}
		}
			System.out.println("Count of Vowels="+c);
			System.out.println("Count of Consonant="+k);
		
	}
		public static void main(String arg[])
		{
			Count_vowel_Constant sd=new Count_vowel_Constant();
			sd.input();
		}
	}
