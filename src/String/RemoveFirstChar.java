package String;
//Q7.Wap enter a string and and remove first character and print final string.
public class RemoveFirstChar {

public void name() {
	String Str="Satish";
	char []a=Str.toCharArray();
	System.out.println("Your First Character Removable");
	for (int i = 1; i < a.length; i++) {
		System.out.print(a[i]);
	}
}
public static void main(String[] args) {
	RemoveFirstChar ss= new RemoveFirstChar();
	ss.name();
	
}
}
