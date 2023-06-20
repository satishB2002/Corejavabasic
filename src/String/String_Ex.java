package String;
/*Write a Java program to read a string and return the string without the first two characters. Keep the first character if it is 'g' and keep the second character if it is 'h'. Go to the editor

Sample Output:

The given strings is: goat
The new string is: gat

he given strings is: photo
The new string is: hoto

The given strings is: ghost
The new string is: ghost*/
public class String_Ex {
public static void main(String[] args) {
	String string="goat";
	
	char a[]=string.toCharArray();
	for (int i = 0; i <a.length; i++) {
		if(a[i]=='g')
		{
			
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}
