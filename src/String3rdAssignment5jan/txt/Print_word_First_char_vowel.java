//Q3.Wap input a string and print only those word which first character is vowel.
package String3rdAssignment5jan.txt;
import java.util.*;
public class Print_word_First_char_vowel {
	String Str="my name Is satish barate";
	int i;
	Print_word_First_char_vowel ()
	{
		String a[]=Str.split(" ");
		for(i=0;i<a.length;i++)
		{
			char c[]=a[i].toCharArray();
			if(c[0]=='a'||c[0]=='e'||c[0]=='i'||c[0]=='o'||c[0]=='u'||c[0]=='A'||c[0]=='E'||c[0]=='I'||c[0]=='O'||c[0]=='U')
				System.out.println("First char Vowel is ="+a[i]);
		}
		
	}
	public static void main(String arg[])
	{
		Print_word_First_char_vowel  ss=new Print_word_First_char_vowel ();
	}
}
