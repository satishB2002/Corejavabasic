/*3. Write a Java program to get the character (Unicode code point) before the specified index within the String. Go to the editor

Sample Output:

Original String : w3resource.com                                                                              
Character(unicode point) = 119                                                                                
Character(unicode point) = 99
Click me to see the solution*/

package String_Main_Assignment;

public class Quetion_3 {
	int i,j;
	String Str="w3resource.com";
	public void input() {
		char a[]=Str.toCharArray();
		for(i=0;i<a.length;i++)
		{
		System.out.println(Str.codePointAt(i));	
		}
		System.out.println("Chatracter Unicode Point ="+Str.codePointAt(0));
		System.out.println("Chatracter Unicode Point ="+Str.codePointAt(8));
	}
public static void main(String[] args) {
	Quetion_3 ss=new Quetion_3();
	ss.input();
}
}
