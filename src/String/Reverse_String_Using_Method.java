package String;
/*Write a Java program to reverse every word in a string using methods.  Return Type Methods
The given string is: This is a test string
The string reversed word by word is: 
sihT si a tset gnirts*/
public class Reverse_String_Using_Method {
public static void main(String[] args) {
	String Str=" This is a test string";
	char a[]=Str.toCharArray();
	for (int i = a.length-1; i >= 0; i--) {
		System.out.print(a[i]);
	}
	for (int i = 0; i < a.length; i++) {
		
		System.out.print(a[i]);
		break;
	}
	
}
}
