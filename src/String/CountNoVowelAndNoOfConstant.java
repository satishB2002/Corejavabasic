package String;
//10.enter a string and count the no of vowel and consonent.
public class CountNoVowelAndNoOfConstant {
public void name() {
	String Str="Satish";
	int c=0;
	int k=0;
	for (int i = 0; i < Str.length(); i++) {
		if(Str.charAt(i)=='a'||Str.charAt(i)=='e'||Str.charAt(i)=='i'||Str.charAt(i)=='o'||Str.charAt(i)=='u'||Str.charAt(i)=='A'||Str.charAt(i)=='E'||Str.charAt(i)=='I'||Str.charAt(i)=='O'||Str.charAt(i)=='U')
		{
			c++;
		}
		else
			k++;
		
	}
	System.out.println("Count Of Vowels ="+c);
	System.out.println("Count Of Costant ="+k);
}
public static void main(String[] args) {
	CountNoVowelAndNoOfConstant ss=new CountNoVowelAndNoOfConstant();
	ss.name();
}
}
