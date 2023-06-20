/*Q5. Wap to count whitespace of given String

  String s="Welcome to the world of technology"*/

package Character_Class;

public class White_Space {
	public static void main(String[] args) {
		int i;
		String Str="Welcome to the world of technology";
		char[]a=Str.toCharArray();
		int c=0;
		for(i=0;i<a.length;i++)
		{
			if(Character.isWhitespace(a[i]))
			{
				c++;
			}
			
		}
		System.out.println(c);
	}
}
