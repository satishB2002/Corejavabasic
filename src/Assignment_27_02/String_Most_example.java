package Assignment_27_02;

public class String_Most_example {
public static void main(String[] args) {
	String 	Str="My NaMe iS SaTisH";
	String	res="";
	char ch;
	for (int i =  Str.length()-1; i>=0; i--) {
		ch=Str.charAt(i);
		if (Character.isUpperCase(ch)) {
			
			
			
			
			
			ch=Character.toLowerCase(ch);
			
			
		} else {
		ch=Character.toUpperCase(ch);
					
		}
		res=res+ch;
		
		
	}
	System.out.println(res);
}
}
