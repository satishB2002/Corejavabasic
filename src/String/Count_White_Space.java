package String;
//Q14.Wap enter a string and find the count of white space.
public class Count_White_Space {
public void name() {
	String Str="Satish Barate In Pune";
	
	//String S1[]=Str.split(" ");
	int c=0;
	for (int i = 0; i < Str.length(); i++) {
		if(Str.charAt(i)<=' ')
		{
			c++;
		}
		
	}
	System.out.println("Count Of White Space="+c);
	
}
public static void main(String[] args) {
	Count_White_Space ss=new Count_White_Space();
	ss.name();
}
}
