/*Q1.


Write a Java program to check two given strings whether any one of them appear at the end of the other string

The given strings are: xyz  and pqrxyz
Is one string appears at the end of other? true

The given strings are: pqrxyz  and xyz
Is one string appears at the end of other? tr*/
package String;

import java.util.Scanner;

public class AppearTheEndoftheString {
	Scanner x=new Scanner(System.in);
public boolean name() {
	String s;
	
	System.out.println("Enter String");
	s=x.next();
	
	int len = s.length();
	  String abc = "xyz";
	  Boolean match = false;
	  if (len < 3)
	    return false;
	  for (int i = 0; i < len - 2; i++) 
	  {
	    String temp = s.substring(i, i+3);
	    
	    if (temp.compareTo(abc) == 0 && i == 0)
	      match = true;
	    
	    else if(temp.compareTo(abc) == 0 && s.charAt(i-1) != 46)
	      match = true;
	  } 
	  
	  return match;
	
}
 public static void main(String[] args) {
	 AppearTheEndoftheString ss=new AppearTheEndoftheString();
	 
	 System.out.println(ss.name());
}
}
