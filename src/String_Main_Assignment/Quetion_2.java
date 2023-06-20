/*2. Write a Java program to get the character (Unicode code point) at the given index within the String. Go to the editor

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 51                                                                                 
Character(unicode point) = 101 
Click me to see the solution*/
package String_Main_Assignment;

public class Quetion_2 {
	int i,j;
	String Str="w3resource.com ";
	public void input() {
		char []a=Str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			//System.out.println(Str.codePointAt(i));
		}
		System.out.println("Character Unicode Point="+Str.codePointAt(1));
		System.out.println("Character Unicode Point="+Str.codePointAt(9));
	}
public static void main(String[] args) {
	
	Quetion_2 ss=new Quetion_2();
	ss.input();
}
}
