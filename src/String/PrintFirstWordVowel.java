//Q3.Wap input a string and print only those word which first character is vowel.
package String;

public class PrintFirstWordVowel {
String Str="Satish Barate In Pune ";
public void input() {
	String []S1=Str.split(" ");
	for (int i = 0; i < S1.length; i++) {
		char a[]=S1[i].toCharArray();
		final int l=0;
		if(a[l]=='a'||a[l]=='e'||a[l]=='i'||a[l]=='o'||a[l]=='u'||a[l]=='A'||a[l]=='E'||a[l]=='I'||a[l]=='O'||a[l]=='U')
		{
			System.out.println(S1[i]);
			
		}
	}
}
public static void main(String[] args) {
	PrintFirstWordVowel ss=new PrintFirstWordVowel();
	ss.input();
	
}
}
