package String;
//Q8.Wap enter a string and and remove last character and print final string.
public class RemoveLastChar {
public void name() {
	String Str="Satish";
	System.out.println("Your Last Char Is Removable");
	char a[]=Str.toCharArray();
	for (int i = 0; i < a.length-1; i++) {
		System.out.println(a[i]);
	}
}
public static void main(String[] args) {
	RemoveLastChar ss=new RemoveLastChar();
	ss.name();
}
}
