package String;

public class RemoveSpecialChar {
public static void main(String[] args) {
	String	Str	="Satish@%*&^$;:=?.,/123";
	char a[]=Str.toCharArray();
	for (int i = 0; i < a.length; i++) {
		if (Character.isAlphabetic(a[i])||Character.isDigit(a[i])||a[i]==' ')
		{
			System.out.print(a[i]);
		}
		
		}
	
}
}
