package String;
//Write a Java program to replace all the ‘d’ characters with ‘f’ characters
public class Replace_One_Char_To_Another_Char {
public static void main(String[] args) {
	String Str="Satish devil dd";
	char []a=Str.toCharArray();
	for (int i = 0; i < a.length; i++) {
		if(a[i]=='d')
		a[i]='f';
		System.out.print(a[i]);
	}
}
}
