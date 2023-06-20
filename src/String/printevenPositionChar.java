//7.Wap enter a string and print the character present at even position.
package String;

public class printevenPositionChar {
String Str="Satishbarate";
public void name() {
	char a[]=Str.toCharArray();
	System.out.println("Even Pos Char");
	for (int i = 0; i < a.length; i=i+2) {
		System.out.println(a[i]);
	}
}
public static void main(String[] args) {
	printevenPositionChar  ss=new printevenPositionChar ();
	ss.name();
}
}
