package String;
//14.Write a Java program to find reverse of a each character in a string.
public class REverseEachCharInString {
public void name() {
	String Str="Satish ";
	System.out.println("Your Reverse String");
	for (int i =Str.length()-1; i>=0; i--) {
		System.out.print(Str.charAt(i));
	}
}

public static void main(String[] args) {
	REverseEachCharInString ss=new REverseEachCharInString();
	ss.name();
}
}
