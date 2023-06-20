/*Q2.


Write a Java program to check whether a substring appears before a period(.) within a given string.

The given strings is: testabc.test
Is 'abc' appear before period? true

The given string is: test.abctest
Is 'abc' appear before period? false*/
package String;

public class Substring_Apears {
	
	public boolean name() {
		String Str="testabc.test";
		String SS="Satish";
		int k=0;
		char a[]=Str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if(a[i]=='.')
			{
			k=i;	
			}
			
		}
		String sb=Str.substring(0,k);
		System.out.println(sb);
		if(sb.endsWith("abc"));
		return true;
		
		
	
			
		
		
		
		
	}
	public static void main(String[] args) {
		Substring_Apears ss=new Substring_Apears();
	}

}
