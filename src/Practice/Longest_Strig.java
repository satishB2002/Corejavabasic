package Practice;

public class Longest_Strig {
public void name() {
	String Str="thequickbrownfoxxofnworbquickthe";
	StringBuffer sb=new StringBuffer(Str);
	sb.reverse().toString();
	String s=sb.reverse().toString();
	System.out.println("The given string is:"+Str);
	
	if(s.equals(Str))
	{
		System.out.println("The length of the palindromic substring is:"+s.length());
	}
	
}
public static void main(String[] args) {
	Longest_Strig ss=new Longest_Strig();
	ss.name();
}
}
