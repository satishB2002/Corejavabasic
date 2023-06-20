package String;

public class intern_method {
public static void main(String[] args) {
	String s="hello";
	String s1=new String("hello");
	String s3=new String("byyy");
	String s4=new String("byyy");
	String s2=s1.intern();
	
	System.out.println(s==s2);
	System.out.println(s3==s4);
}
}
