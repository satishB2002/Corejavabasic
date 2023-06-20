package String;
/*Q1.Given a string, the task is to reverse the order of the words in the given string. 

Examples:

Input: s = “geeks quiz practice code” 
Output: s = “code practice quiz geeks”*/
public class ReverseStringByWord {
public void name() {
	String Str="geeks quiz practice code";
	System.out.println(Str);
	String[] S1=Str.split(" ");
	
	
	
	for (int i =S1.length-1; i >=0; i--)
	{
		
		System.out.print(" "+S1[i]);
	}
	
}
public static void main(String[] args) {
	ReverseStringByWord ss=new ReverseStringByWord();
	ss.name();
}
}
