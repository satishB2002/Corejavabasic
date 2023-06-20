package String;

public class String_Palindrome1 {
	public void name() {
		
	

String Str="aba";
StringBuffer sb= new StringBuffer(Str);
String S2=sb.reverse().toString();
if(Str.equals(S2))
{
	System.out.println("String Are Palindrome");
}
else
System.out.println("String Are Not Palindrome");
	}
	public static void main(String[] args) {
		String_Palindrome1 ss=new String_Palindrome1();
		ss.name();
	}
}

