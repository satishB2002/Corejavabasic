//17.Wap show that string is immutable.
package String;
import java.util.*;

public class immutable_String {
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Your First String");
	String Str=sc.nextLine();
	System.out.println("Enter Your Second String");
	String Str1=sc.nextLine();
	System.out.println(Str.concat(Str));
	
}
public static void main(String arg[])
{
	immutable_String  ss=new immutable_String ();
	ss.input();
}
}
