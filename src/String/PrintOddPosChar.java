package String;
//8.Wap enter a string and print the character present at odd position.
public class PrintOddPosChar {
public void name() {
	String Str="Satish";
	char []a=Str.toCharArray();
	System.out.println("Odd Pos Char");
	for (int i = 1; i < a.length; i=i+2) {
		System.out.println(a[i]);
	}
}
public static void main(String[] args) {
	PrintOddPosChar ss=new PrintOddPosChar();
	ss.name();
	
}
}
