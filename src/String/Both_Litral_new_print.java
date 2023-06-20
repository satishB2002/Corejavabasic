//1.initilised a string by both literal and by new and print it
package String;
import java.util.*;
public class Both_Litral_new_print {
	static String sb="Satish Barate";
	static String ss=new String();
	public static  void CharAtMethod()
	{
		int i;
		for(i=0;i<ss.length();i++)
		{
			System.out.println(ss.charAt(i)+" "+i);
		}
		for(i=0;i<sb.length();i++)
		{
			System.out.println(sb.charAt(i)+" "+i);
		}
		
	}
	public static void main(String arg[])
	{
		CharAtMethod();
	}
	}

