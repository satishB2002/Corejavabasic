package Assignment_27_02;
//Q3.Write a Java program to remove first occurrence of a character from string.

public class Q5 {
public static void main(String[] args) {
	String s="Satish Barate";
	char []a=s.toCharArray();
	for (int i = 0; i < a.length; i++) {
		if (i!=0) {
			System.out.print(a[i]);
			
		}
	}
}
}
