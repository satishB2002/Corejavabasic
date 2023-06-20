package Strin_Buffer;
//Q3.Write a java program to reverse a sentence word by 
//word? For example, If “Java Concept Of The Day” 
//is an input string then output will be “Day The Of Concept Java”. 

public class Reverse_String_WordByWord {
public void name() {
	String Str="Java Concept Of The Day ";
	String[] S1=Str.split(" ");
	for (int i = S1.length-1; i >=0; i--) {
		System.out.print(S1[i]+" ");
	}
	
}
public static void main(String[] args) {
	Reverse_String_WordByWord  ss=new Reverse_String_WordByWord ();
	ss.name();
}
}
