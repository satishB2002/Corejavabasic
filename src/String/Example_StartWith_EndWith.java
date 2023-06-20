package String;
//Q11.Wap enter a string and use endwith() and startwith() method.
public class Example_StartWith_EndWith {
	String Str="Satish";
	
public void name() {
	System.out.println(Str.endsWith("abc"));
}
public void input() {
	System.out.println(Str.startsWith("Sat"));
}
public static void main(String[] args) {
	Example_StartWith_EndWith ss=new Example_StartWith_EndWith();
	ss.name();
	ss.input();
}
}
