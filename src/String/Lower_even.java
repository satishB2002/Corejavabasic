package String;
import java.util.*;
public class Lower_even {
Scanner sc=new Scanner(System.in);
String Str="SATISH";
public void input()
{
	int i;
	for(i=0;i<Str.length();i++)
	{
		if(i%2==0)
		{
			char a[]=Str.toCharArray();
			System.out.println(Character.toLowerCase(a[i]));
		}
		else
		{
			System.out.println(Str.charAt(i));
		}
	}
}
public static void main(String arg[])
{
	Lower_even ss=new Lower_even();
	ss.input();
}
}
