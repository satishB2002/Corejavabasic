package String;
//Q. Rev the string and remove the vowel
public class Rev_String_Remove_Vowel {
public static void main(String[] args) {
	String Str="satish baratae in pune";
	char a[]=Str.toCharArray();
	for (int i = a.length-1; i >0; i--) {
		if('a'==a[i]||'e'==a[i]||'i'==a[i]||'o'==a[i]||'u'==a[i])
		{
			System.out.print("");
			
		}
		else {
			System.out.print(a[i]);
		}
			
	}
	
}
}
