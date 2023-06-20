package Character_Class;

public class Digit_Or_Not {
	public static void main(String[] args) {
		int i;
		String Str="Welcome To Java123";
		char[]a=Str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			System.out.println(Character.isDigit(a[i]));
		}
	}
}
