package Rabbit_Practice;
//4. Write a Java program to reverse a string without using the built-in reverse() method.
public class Q4 {
public static void main(String[] args) {
	String str="Satish";
	for (int i = str.length()-1; i >=0; i--) {
		System.out.println(str.charAt(i));
		}
}
}
