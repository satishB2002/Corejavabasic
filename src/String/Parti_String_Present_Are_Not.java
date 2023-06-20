package String;
//Q17.Wap enter a string and check any particular string are present in it or not using contains().
public class Parti_String_Present_Are_Not {
String Str="Satish Barate in pune";
public void  name() {
	//System.out.println(Str.contains("Satish"));
	if(Str.contains("Nashik"))
			{
		System.out.println("String Are Present");
			}
	else
		System.out.println("String Are Not Present");
		
}
public static void main(String[] args) {
	Parti_String_Present_Are_Not ss=new Parti_String_Present_Are_Not();
	ss.name();
	
}

}
