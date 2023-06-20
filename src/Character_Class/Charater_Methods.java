package Character_Class;

public class Charater_Methods {
	public static void main(String[] args) {
		int i;
		String Str="Welcome To Java";
		char[]a=Str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			System.out.println(Character.toUpperCase(a[i]));
		}
	}
	
}
