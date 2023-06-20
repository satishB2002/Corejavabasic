//Q2.Wap enter a string and find the count of word and character(excluding space).

package String;

public class Count_Char_Word {
String Str="Satish barate in Pune";
public void input() {
	String [] S1=Str.split(" ");
	int c=0;
	for (int i = 0; i < S1.length; i++) {
		c++;
		
	}
	System.out.println("Count Of The Word="+c);
}
public void disp() {
	char []a=Str.toCharArray();
	int k=0;
	for (int i = 0; i < a.length; i++) {
		k++;
	}
	System.out.println("Count Of Character="+k);
}
public static void main(String[] args) {
	Count_Char_Word ss=new Count_Char_Word();
	ss.input();
	ss.disp();
}
}
