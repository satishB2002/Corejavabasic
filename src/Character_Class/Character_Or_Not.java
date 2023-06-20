package Character_Class;

public class Character_Or_Not {
	public static void main(String[] args) {
		int i;
		String Str="Welcome To Java World";
		char[]a=Str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			System.out.println(Character.isLetter(a[i]));
		}
	}
}
