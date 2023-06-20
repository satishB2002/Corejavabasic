package String;

public class palindrome {
public static void main(String[] args) {
	String Str="abc";
	StringBuffer ss=new StringBuffer(Str);
	String s=ss.reverse().toString();
	if(s.equals(Str))
	{
		System.out.println("Palindrome");
	}
	else
	System.out.println("String are not palindrome");
}
}
