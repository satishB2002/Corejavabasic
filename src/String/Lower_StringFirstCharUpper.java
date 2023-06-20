package String;
//Q5.Wap enter a string in lowercase now you have to convert every first character of the word in upper case. 
public class Lower_StringFirstCharUpper {
	String Str="satish barate ";
	public void name()
	{
  String []S1=Str.split(" ");
	
	for (int i = 0; i < S1.length; i++) {
		char a[]=S1[i].toCharArray();
		System.out.print(Character.toUpperCase(a[0]));
		for (int j = 1; j < a.length; j++) {
			System.out.print(a[j]);
		}
		System.out.print(" ");
	}
}
public static void main(String[] args) {
	FirstNonRepetingChar ss=new FirstNonRepetingChar();
	ss.name();
}
}
