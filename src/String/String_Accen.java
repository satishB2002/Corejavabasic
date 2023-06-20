package String;

import Accessmadifier.publicmodifier;
import parameterass.arrayevenposition;

public class String_Accen {
	public	static void input()
	{
	String S="My name is Satish";
	String s[]=S.split(" ");
	String t;
	for (int i = 0; i < s.length; i++) {
		for (int j = 0; j < s.length; j++) {
		if (s[i].length()<s[j].length()) {
			{
				t=	s[i];
				s[i]=s[j];
				s[j]=t;
			}
			}
		}
	}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	public static void main(String[] args) {
		String_Accen	ss	= new String_Accen();
		ss.input();
	}
}
