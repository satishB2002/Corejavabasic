/*Write a Java method to check whether a string is a valid password. 
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Expected Output:

1. A password must have at least eight characters.                                             
2. A password consists of only letters and digits.                                         
3. A password must contain at least two digits                                        
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
Password is valid: abcd1234*/
package Abstract;

import java.util.Scanner;

public class Password_String {
	Scanner sc=new Scanner(System.in);
	public void pass() {
		System.out.println("                      Password rules:             ");
		System.out.println("       A password must have at least ten characters.      ");
		System.out.println("       A password consists of only letters and digits.     ");
		System.out.println("       A password must contain at least two digits.        ");
		System.out.println("  !! Enter Your Password    !! ");
		String password;
		int c=0,d=0,k=0,size=0;
		password=sc.nextLine();
		for (int i = 0; i < password.length(); i++) 
			size++;
		
		for (int i = 0; i < password.length(); i++) {
			
		
		if(password.charAt(i)>='a'&& password.charAt(i)<='z' ||password.charAt(i)>='A' && password.charAt(i)<='Z')
				c++;
		else if(password.charAt(i)>='0'&& password.charAt(i)<='9')
				d++;
		else
			k++;
		}
		
			if(size>=8 &&  d>=2 && k==0 && c>=1)
			{
			System.out.println("Password Are Valid");
			}
			else
			{	
				System.out.println("Password Are Not Valid ");
			}
			
			
		
	}
	public static void main(String[] args) {
		Password_String ss=new Password_String();
		ss.pass();
	}

}
