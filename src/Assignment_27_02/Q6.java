package Assignment_27_02;
//Q4.Write a Java program to remove last occurrence of a character from string.

public class Q6 {
public static void main(String[] args) {
	String s="My Name is Satish";
	char []a=s.toCharArray();
	for (int i = 0; i < a.length; i++) {
		if (a[i]!=a[a.length-1]) {
			System.out.print(a[i]);
		}
	}
}
}
