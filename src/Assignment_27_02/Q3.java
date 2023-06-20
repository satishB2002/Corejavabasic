package Assignment_27_02;

import java.sql.Array;
import java.util.Arrays;

//Q8.Wap enter a string and sort each word of string in accending and decending order by the length of each word.

public class Q3 {
public static void main(String[] args) {
	String	s	="My Name is Satish";
	String[]	S=s.split(" ");
	String t;
for (int i = 0; i < S.length; i++) {
	char a[]=new char[S[i].length()];
	 char b[]=S[i].toCharArray();
	 Arrays.sort(b);
}
	for (int i = 0; i < S.length; i++) {
		for (int j = i+1; j < S.length; j++) {
			if (S[i].length()>S[j].length()) {
				t=S[i];
				S[i]=S[j];
				S[j]=t;
				
			}
		}
	}
	for (int i = 0; i < S.length; i++) {
		System.out.println(S[i]);
	}
	for (int i = 0; i < S.length; i++) {
		for (int j = i+1; j < S.length; j++) {
			if (S[i].length()<S[j].length()) {
				t=S[i];
				S[i]=S[j];
				S[j]=t;
				
			}
		}
	}
	for (int i = 0; i < S.length; i++) {
		System.out.println(S[i]);
	}
}
}
