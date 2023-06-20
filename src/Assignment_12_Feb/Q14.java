package Assignment_12_Feb;

import java.util.Iterator;

import Interface.interface1;
import Practice.clockwise_1;

/*Q3.Write a Java program to create a new string from a given string swapping the last two 
characters of the given string. The length of the given string must be two or more.
Sample Output:
The given strings is: string 
The string after swap last two characters are: strign*/

public class Q14 {
public static void main(String[] args) {
	String string="Satish";
	char t=0;
	int i;
	char s[]=string.toCharArray();
	for ( i = 0; i < s.length-1; i+=2) {
		t=s[i];
		s[i]=s[i+1];
		s[i+1]=t;
		System.out.print(s[i]+" ");
		
	}
	
}
}
