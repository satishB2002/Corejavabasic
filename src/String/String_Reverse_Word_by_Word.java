package String;

public class String_Reverse_Word_by_Word {
public void name() {
	String s="Pune Barate Satish";
	String []Str=s.split(" ");
	for (int i =  Str.length-1; i >=0; i--) {
		System.out.print(" "+Str[i]);
	}
}
public static void main(String[] args) {
	String_Reverse_Word_by_Word ss=new String_Reverse_Word_by_Word();
	ss.name();
}
}

