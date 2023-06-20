package String;
//2.Write a Java program to find the occurence of first word in the string.
public class OccuranceOfFirstWord {
public void name() {
	String Str="abc pune xyz";
	String S1[]=Str.split(" ");
	int c=0;
	for (int i = 0; i < S1.length; i++) {
		
		if(S1[i]==S1[0])
		{
		c++;
		}
		System.out.println(S1[0]);
	}
	
	
	
	System.out.println("Cont Of First Occurance="+c);
}
public static void main(String[] args) {
	OccuranceOfFirstWord  ss=new OccuranceOfFirstWord ();
	ss.name();
	
}
}
