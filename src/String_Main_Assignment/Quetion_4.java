/*4. Write a Java program to count a number of Unicode code points in the specified text range of a String. Go to the editor

Sample Output:

Original String : w3rsource.com                                                                               
Codepoint count = 9
Click me to see the solution*/
package String_Main_Assignment;

public class Quetion_4 {
	int i,c;
	String Str="w3rsource.com";
	protected void input() {
		char []a=Str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			c=0;
			if(Str.codePointAt(i)==1)
			{
			System.out.println(Str.codePointAt(i));
			c++;
			}
			
		}
		
	System.out.println(c);
	}


public static void main(String[] args) {
	Quetion_4 ss=new Quetion_4();
	ss.input();
}
}
