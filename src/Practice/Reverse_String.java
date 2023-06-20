package Practice;

public class Reverse_String {
public static void main(String[] args) {
	String Str="My Name is Satish";
	String Str2[]=Str.split(" ");
	String output =" ";
	for (int i = Str2.length; i >0; i--) {
		output =output+" "+Str2[i-1];
	}
	System.out.print(output);
}

}
