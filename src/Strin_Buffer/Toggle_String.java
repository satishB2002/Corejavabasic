package Strin_Buffer;

public class Toggle_String {
public static void main(String[] args) {
	String Str="satish is my name";
	String []words=Str.split(" ");
	String SS="";
	for (String string : words) {
		String firstString=string.substring(0,1);
		String secondString=string.substring(1);
		SS=SS+firstString.toLowerCase()+secondString.toUpperCase()+" ";
	}
	SS.trim();
	System.out.println(SS);
}
}
